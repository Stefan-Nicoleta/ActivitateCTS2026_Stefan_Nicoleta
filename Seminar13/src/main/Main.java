package main;

import flyweight.LinieFactory;
import proxy.Autobuz;
import proxy.AutobuzDeNoapte;
import proxy.MijlocTransport;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Proxy
        MijlocTransport mijlocTransport = new Autobuz("102", 25);
        mijlocTransport.oprireStatie();
        mijlocTransport.oprireStatie();

        MijlocTransport mijlocTrFaraCalatori = new Autobuz("243", 0);
        mijlocTrFaraCalatori.oprireStatie();

        MijlocTransport autobuzNoapte = new AutobuzDeNoapte(mijlocTrFaraCalatori);
        autobuzNoapte.oprireStatie();

    //Flyweight
        flyweight.Autobuz autobuz1 = new flyweight.Autobuz("Mercedes",2001,89);
        flyweight.Autobuz autobuz2 = new flyweight.Autobuz("BMW",2021,135);
        flyweight.Autobuz autobuz3 = new flyweight.Autobuz("Dacia",2010,78);
        LinieFactory linieFactory = new LinieFactory();
        linieFactory.getLinie(243,"Universitate","Titan").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinie(70,"Dristor","Pantelimon").afiseazaAutobuzLinie(autobuz2);
        linieFactory.getLinie(102,"Militari","Baneasa").afiseazaAutobuzLinie(autobuz3);
    }
}