package ro.ase.cts.stb_Factory.factory;

import ro.ase.cts.stb_Factory.vehicule.Autobuz;
import ro.ase.cts.stb_Factory.vehicule.MijlocTransport;
import ro.ase.cts.stb_Factory.vehicule.Tramvai;
import ro.ase.cts.stb_Factory.vehicule.Troleibuz;

public class MijlocTransportFactorySingle {

    public static MijlocTransportFactorySingle instanta = null;

    public static MijlocTransportFactorySingle getInstanta(){
        if(instanta == null){
            instanta = new MijlocTransportFactorySingle();
        }
        return instanta;
    }


    public MijlocTransport getMijlocTransport(String marca, int linie, MijlocTransportType tip) {
        if (tip == MijlocTransportType.AUTOBUZ)
            return new Autobuz(marca, linie);
        if (tip == MijlocTransportType.TRAMVAI)
            return new Tramvai(marca, linie);
        if (tip == MijlocTransportType.TROLEIBUZ)
            return new Troleibuz(marca, linie);
        return null;
    };

    public MijlocTransportFactorySingle() {}
}
