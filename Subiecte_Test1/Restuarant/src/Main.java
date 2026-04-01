import ro.ase.cts.B1.simpleFactory.clase.Supe;
import ro.ase.cts.B1.simpleFactory.enums.TipSupa;
import ro.ase.cts.B1.simpleFactory.fabrici.FabricaSupe;
import ro.ase.cts.B2.builder.Rezervare;
import ro.ase.cts.B2.builder.RezervareBuilder;


public class Main {
    public static void main(String[] args) throws Exception {

        //B.1. - Simple Factory
        FabricaSupe fabricaSupe = new FabricaSupe ();
        Supe supe = null;

        supe = fabricaSupe.createSupa(TipSupa.VITA);
        supe.descriereSupa();

        //B.2. - Builder
        Rezervare rezervare1 = new RezervareBuilder().setNumeClient("Nicoleta").
                setAsezareLaGeam(true).setDecorareMasa(true).build();

        System.out.println(rezervare1.toString());


    }
}