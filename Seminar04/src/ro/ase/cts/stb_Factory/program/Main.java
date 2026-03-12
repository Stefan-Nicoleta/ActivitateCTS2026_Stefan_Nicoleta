package ro.ase.cts.stb_Factory.program;

import ro.ase.cts.stb_Factory.factory.MijlocTransportFactory;
import ro.ase.cts.stb_Factory.factory.MijlocTransportFactorySingle;
import ro.ase.cts.stb_Factory.factory.MijlocTransportType;
import ro.ase.cts.stb_Factory.vehicule.MijlocTransport;

public class Main {

    public static void afisareMijlocTransport(MijlocTransport mijlocTransport){
        mijlocTransport.afisareDescriere();
    }

    public static void main(String[] args) {

        //aici factory single
        MijlocTransportFactorySingle mijlocTransportFactorySingle = MijlocTransportFactorySingle.getInstanta();

        //aici factory
        MijlocTransportFactory factory = new MijlocTransportFactory();

        MijlocTransport autobuz = factory.getMijlocTransport("Mercedes", 432, MijlocTransportType.AUTOBUZ);
        MijlocTransport tramvai = factory.getMijlocTransport("Astra", 1, MijlocTransportType.TRAMVAI);
        MijlocTransport troleibuz = factory.getMijlocTransport("Mercedes", 98, MijlocTransportType.TROLEIBUZ);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(tramvai);
        afisareMijlocTransport(troleibuz);
    }
}
