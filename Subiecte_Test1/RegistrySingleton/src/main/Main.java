package main;

import registry.Cazare;
import registry.Registry;
import registry.Transport;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Cazare cazare = new Cazare();
        Cazare cazare2 = new Cazare();
        Transport transport = new Transport();

        Registry.register("Cazare",cazare);
        Registry.register("Transport",transport);

        Registry.getPachet("Cazare").descriere();
        Registry.getPachet("Transport").descriere();

    }
}