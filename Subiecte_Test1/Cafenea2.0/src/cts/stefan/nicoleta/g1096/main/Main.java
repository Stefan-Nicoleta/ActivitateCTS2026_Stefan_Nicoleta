package cts.stefan.nicoleta.g1096.main;

import cts.stefan.nicoleta.g1096.prototype.AbstractPrototype;
import cts.stefan.nicoleta.g1096.prototype.BauturaPresetata;
import cts.stefan.nicoleta.g1096.simplefactory.Bautura;
import cts.stefan.nicoleta.g1096.simplefactory.FabricaBauturi;
import cts.stefan.nicoleta.g1096.simplefactory.IBautura;
import cts.stefan.nicoleta.g1096.simplefactory.TipBautura;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IBautura iBautura = FabricaBauturi.createBautura(TipBautura.CAFEA,"Ceva",234,22);
        System.out.println(iBautura.toString());


        AbstractPrototype bautura1 = new BauturaPresetata("Latte", 120,10);
        AbstractPrototype bautura2 = bautura1.clone();

        System.out.println(bautura1.toString()+System.identityHashCode(bautura1));
        System.out.println(bautura2.toString()+System.identityHashCode(bautura2));

    }
}