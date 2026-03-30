package cts.stefan.nicoleta.g1096.main;

import cts.stefan.nicoleta.g1096.prototype.BauturaPresetata;
import cts.stefan.nicoleta.g1096.simplefactory.Bautura;
import cts.stefan.nicoleta.g1096.simplefactory.FabricaBauturi;
import cts.stefan.nicoleta.g1096.simplefactory.TipBautura;

public class Main {
    public static void main(String[] args) {

        try{
            System.out.println("Cerinta Simple Factory");
            System.out.println();
        Bautura bauturi1 = FabricaBauturi.createBauturi(TipBautura.CAFEA, "Latte cu caramel", 150, 30);
        Bautura bauturi2 = FabricaBauturi.createBauturi(TipBautura.CEAI, "Fructe de padure", 132, 15);
        Bautura bauturi3 = FabricaBauturi.createBauturi(TipBautura.CIOCOLATA_CALDA, "Ciocolata calda cu bezele", 100, 14);
        Bautura bauturi4 = FabricaBauturi.createBauturi(TipBautura.CAFEA, "Latte cu caramel sarat", 150, 35);


            System.out.println(bauturi1);
        bauturi1.preparare();
            System.out.println();

            System.out.println(bauturi2);
            bauturi2.preparare();
            System.out.println();

            System.out.println(bauturi3);
            bauturi3.preparare();
            System.out.println();

            System.out.println(bauturi4);
            bauturi4.preparare();


            System.out.println();
            System.out.println("Cerinta Prototype");
            System.out.println();
            BauturaPresetata bauturaPresetata = new BauturaPresetata();

            bauturaPresetata.adaugaBauturaPresetata("Latte_caramel_150", bauturi1);
            bauturaPresetata.adaugaBauturaPresetata("Ceai_fructe", bauturi2);

            Bautura bautura6 = FabricaBauturi.createBauturi(TipBautura.CAFEA,"Latte cu caramel", 350, 20);
            bauturaPresetata.adaugaBauturaPresetata("Latte_caramel_350",bautura6);

            System.out.println(bauturaPresetata.getBautura("Ceai_fructe"));
            System.out.println(bauturaPresetata.getBautura("Latte_caramel_150"));
            System.out.println(bauturaPresetata.getBautura("Latte_caramel_350"));
            System.out.println(bauturaPresetata.getBautura("ceva"));




    } catch (Exception e) {
            System.out.println("Eroare!");
        }
    }
}