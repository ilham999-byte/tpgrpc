package org.example.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.stubs.*;
import org.example.service.ReservationGrpcService;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        // Crée et démarre le serveur gRPC sur le port 50051
        Server server = ServerBuilder.forPort(50051)
                .addService(new ReservationGrpcService()) // Ajoute le service de réservation
                .build();

        server.start();
        System.out.println("Server started, listening on port 50051");

        // Attend que le serveur soit arrêté
        server.awaitTermination();
    }
}
