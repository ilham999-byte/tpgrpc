// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bank.proto

package org.example.stubs;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.Client client = 2;</code>
   * @return Whether the client field is set.
   */
  boolean hasClient();
  /**
   * <code>.Client client = 2;</code>
   * @return The client.
   */
  org.example.stubs.Client getClient();
  /**
   * <code>.Client client = 2;</code>
   */
  org.example.stubs.ClientOrBuilder getClientOrBuilder();

  /**
   * <code>.Chambre chambre = 3;</code>
   * @return Whether the chambre field is set.
   */
  boolean hasChambre();
  /**
   * <code>.Chambre chambre = 3;</code>
   * @return The chambre.
   */
  org.example.stubs.Chambre getChambre();
  /**
   * <code>.Chambre chambre = 3;</code>
   */
  org.example.stubs.ChambreOrBuilder getChambreOrBuilder();

  /**
   * <pre>
   * Date formatted as a string, or use google.protobuf.Timestamp for Date
   * </pre>
   *
   * <code>string dateDebut = 4;</code>
   * @return The dateDebut.
   */
  java.lang.String getDateDebut();
  /**
   * <pre>
   * Date formatted as a string, or use google.protobuf.Timestamp for Date
   * </pre>
   *
   * <code>string dateDebut = 4;</code>
   * @return The bytes for dateDebut.
   */
  com.google.protobuf.ByteString
      getDateDebutBytes();

  /**
   * <pre>
   * Date formatted as a string, or use google.protobuf.Timestamp for Date
   * </pre>
   *
   * <code>string dateFin = 5;</code>
   * @return The dateFin.
   */
  java.lang.String getDateFin();
  /**
   * <pre>
   * Date formatted as a string, or use google.protobuf.Timestamp for Date
   * </pre>
   *
   * <code>string dateFin = 5;</code>
   * @return The bytes for dateFin.
   */
  com.google.protobuf.ByteString
      getDateFinBytes();

  /**
   * <code>string preferences = 6;</code>
   * @return The preferences.
   */
  java.lang.String getPreferences();
  /**
   * <code>string preferences = 6;</code>
   * @return The bytes for preferences.
   */
  com.google.protobuf.ByteString
      getPreferencesBytes();
}