package org.example.service;

import io.grpc.stub.StreamObserver;
import org.example.stubs.*;

import java.util.HashMap;
import java.util.Map;

public class ReservationGrpcService extends ReservationServiceGrpc.ReservationServiceImplBase {
    private final Map<String, Reservation> reservations = new HashMap<>();

    // Crée une nouvelle réservation
    @Override
    public void createReservation(ReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        String clientId = request.getClientId();
        String chambreId = request.getChambreId();
        String dateDebut = request.getDateDebut();
        String dateFin = request.getDateFin();
        String preferences = request.getPreferences();

        // Crée une réservation
        Reservation reservation = Reservation.newBuilder()
                .setId("res" + (reservations.size() + 1)) // Génère un ID simple
                .setClient(Client.newBuilder()
                        .setId(clientId)
                        .setNom("NomClient") // Remplacer par un vrai nom
                        .setPrenom("PrenomClient") // Remplacer par un vrai prénom
                        .setEmail("email@domain.com") // Remplacer par un vrai email
                        .setTelephone("123456789") // Remplacer par un vrai téléphone
                        .build())
                .setChambre(Chambre.newBuilder()
                        .setId(chambreId)
                        .setType("Simple") // Remplacer par un vrai type de chambre
                        .setPrix(100.0f) // Remplacer par un vrai prix
                        .setDisponible(true)
                        .build())
                .setDateDebut(dateDebut)
                .setDateFin(dateFin)
                .setPreferences(preferences)
                .build();

        // Ajoute la réservation à la carte
        reservations.put(reservation.getId(), reservation);

        // Retourne la réponse avec la réservation créée
        ReservationResponse response = ReservationResponse.newBuilder()
                .setReservation(reservation)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // Récupère une réservation par ID
    @Override
    public void getReservationById(GetReservationByIdRequest request, StreamObserver<GetReservationByIdResponse> responseObserver) {
        String reservationId = request.getId();
        Reservation reservation = reservations.get(reservationId);

        if (reservation != null) {
            GetReservationByIdResponse response = GetReservationByIdResponse.newBuilder()
                    .setReservation(reservation)
                    .build();
            responseObserver.onNext(response);
        } else {
            responseObserver.onError(new Exception("Réservation non trouvée"));
        }
        responseObserver.onCompleted();
    }

    // Récupère toutes les réservations
    @Override
    public void getAllReservations(GetAllReservationsRequest request, StreamObserver<GetAllReservationsResponse> responseObserver) {
        GetAllReservationsResponse.Builder responseBuilder = GetAllReservationsResponse.newBuilder();
        for (Reservation reservation : reservations.values()) {
            responseBuilder.addReservations(reservation);
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    // Met à jour une réservation
    @Override
    public void updateReservation(UpdateReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        String reservationId = request.getId();
        Reservation existingReservation = reservations.get(reservationId);

        if (existingReservation != null) {
            Reservation updatedReservation = existingReservation.toBuilder()
                    .setClient(Client.newBuilder()
                            .setId(request.getClientId())
                            .setNom("NomMisAJour") // Mise à jour avec un vrai nom
                            .setPrenom("PrenomMisAJour") // Mise à jour avec un vrai prénom
                            .setEmail("email@updated.com") // Mise à jour avec un vrai email
                            .setTelephone("987654321") // Mise à jour avec un vrai téléphone
                            .build())
                    .setChambre(Chambre.newBuilder()
                            .setId(request.getChambreId())
                            .setType("Deluxe") // Mise à jour avec un vrai type de chambre
                            .setPrix(150.0f) // Mise à jour avec un vrai prix
                            .setDisponible(true)
                            .build())
                    .setDateDebut(request.getDateDebut())
                    .setDateFin(request.getDateFin())
                    .setPreferences(request.getPreferences())
                    .build();

            reservations.put(reservationId, updatedReservation);

            ReservationResponse response = ReservationResponse.newBuilder()
                    .setReservation(updatedReservation)
                    .build();
            responseObserver.onNext(response);
        } else {
            responseObserver.onError(new Exception("Réservation non trouvée"));
        }
        responseObserver.onCompleted();
    }

    // Supprime une réservation
    @Override
    public void deleteReservation(DeleteReservationRequest request, StreamObserver<DeleteReservationResponse> responseObserver) {
        String reservationId = request.getId();
        Reservation removedReservation = reservations.remove(reservationId);

        DeleteReservationResponse response = DeleteReservationResponse.newBuilder()
                .setSuccess(removedReservation != null)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
