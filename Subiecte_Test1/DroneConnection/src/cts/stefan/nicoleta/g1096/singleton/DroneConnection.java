package cts.stefan.nicoleta.g1096.singleton;

import java.util.ArrayList;
import java.util.List;

public class DroneConnection implements IDroneConnection{


    private static DroneConnection instanta = null;

    private DroneConnection() {
    }

    //connect
    //adaugare in lista

    private List<String> listaUseri = new ArrayList<>();

    @Override
    public void connect(String userName) {
        listaUseri.add(userName);
    }

    @Override
    public void disconnect(String userName) {
        listaUseri.remove(userName);
    }

    @Override
    public boolean isConnected(String userName) {
        return listaUseri.contains(userName);
    }

    @Override
    public void viewConnections() {
        for (int i = 0; i < listaUseri.size(); i++) {
            System.out.println(listaUseri.get(i));
        }
    }


    public static DroneConnection getInstance(){
        if(instanta == null){
            instanta = new DroneConnection();
        }
        return instanta;
    }


}
