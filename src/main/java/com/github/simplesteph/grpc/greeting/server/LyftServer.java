package com.github.simplesteph.grpc.greeting.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import io.grpc.protobuf.services.ProtoReflectionService;

public class LyftServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(
                "Hello gRPC"
        );
        Server server= ServerBuilder.forPort(50091)
                .addService(new LyftServiceImpl())
                .addService(ProtoReflectionService.newInstance())
                .build();

        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("successfully stopped the server");
        }));

        server.awaitTermination();
    }
}
