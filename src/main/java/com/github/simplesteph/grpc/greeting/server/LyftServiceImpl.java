package com.github.simplesteph.grpc.greeting.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.proto.lyft.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;


public class LyftServiceImpl extends LyftServiceGrpc.LyftServiceImplBase {

    private MongoClient mongoclient = MongoClients.create("mongodb://localhost:27017");
    private MongoDatabase database = mongoclient.getDatabase("lyftdb");
    private MongoCollection<Document> collection = database.getCollection("lyft");




    @Override
    public void createLyft(CreateLyftRequest request, StreamObserver<CreateLyftResponse> responseObserver) {

        System.out.println("Received create a Lyft request");

        Lyft lyft = request.getLyft();

        Document doc = new Document ("driver_id", lyft.getDriverId())
                .append("rating", lyft.getRating() )
                .append("car", lyft.getCar());


        System.out.println("Inserting request...");
        collection.insertOne(doc);
        String id = doc.getObjectId("_id").toString();

        System.out.println("Inserted request" + id);

        CreateLyftResponse response = CreateLyftResponse.newBuilder()
                .setLyft(lyft.toBuilder().setId(id).build())
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }

    @Override
    public void readLyft(ReadLyftRequest request, StreamObserver<ReadLyftResponse> responseObserver) {

        System.out.println("received read lyft request");
        String lyftId = request.getLyftId();

        System.out.println("Searching");
        Document result = null;

        try {

            result = collection.find(eq("_id", new ObjectId(lyftId)))
                    .first();
        } catch (Exception e) {
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("Driver with this ID not found")
                            .asRuntimeException()
            );
        }

        if (result == null) {
            responseObserver.onError(
                    Status.NOT_FOUND
                    .withDescription("Driver with this ID not found")
                    .asRuntimeException()
            );
        } else {

            Lyft lyft = Lyft.newBuilder()
                    .setDriverId(result.getString("driver_id"))
                    .setRating(result.getString("rating"))
                    .setCar(result.getString("car"))
                    .setId(lyftId)
                    .build();
            responseObserver.onNext(ReadLyftResponse.newBuilder().setLyft(lyft).build());
            responseObserver.onCompleted();


        }
    }

}
