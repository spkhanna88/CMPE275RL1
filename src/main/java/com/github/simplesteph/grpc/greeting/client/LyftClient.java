package com.github.simplesteph.grpc.greeting.client;

import com.proto.lyft.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LyftClient {

    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC Client");

        LyftClient main = new LyftClient();
        main.run();

    }

    private void run() {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50091)
                .usePlaintext()
                .build();

        LyftServiceGrpc.LyftServiceBlockingStub lyftClient = LyftServiceGrpc.newBlockingStub(channel);

        Lyft lyft = Lyft.newBuilder()
                .setDriverId("Jdoe")
                .setRating("Good Driver")
                .setCar("This is my first car")
                .build();

        CreateLyftResponse createResponse = lyftClient.createLyft(
                CreateLyftRequest.newBuilder()
                .setLyft(lyft)
                .build()
        );

        System.out.println("Received create Lyft Response");
        System.out.println(createResponse.toString());

        String lyftId = createResponse.getLyft().getId();

        ReadLyftResponse readLyftResponse = lyftClient.readLyft(ReadLyftRequest.newBuilder()
                .setLyftId(lyftId)
                .build());

        System.out.println(readLyftResponse.toString());

        ReadLyftResponse readLyftResponseNotFound = lyftClient.readLyft(ReadLyftRequest.newBuilder()
                .setLyftId("fake-id")
                .build());
    }
}
