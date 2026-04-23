package cts.stefan.nicoleta.g1096.singleton.model;

public interface IDroneConnection {
    void connect(String userName);
    void disconnect(String userName);
    boolean isConnected(String userName);
    void viewConnections();
}
