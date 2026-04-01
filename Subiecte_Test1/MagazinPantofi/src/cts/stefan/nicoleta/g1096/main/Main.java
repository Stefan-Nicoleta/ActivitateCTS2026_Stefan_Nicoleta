package cts.stefan.nicoleta.g1096.main;

import cts.stefan.nicoleta.g1096.prototype.MesajePantofi;
import cts.stefan.nicoleta.g1096.prototype.PrototypeMesaje;
import cts.stefan.nicoleta.g1096.simpleFactory.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Simple Factory
        FabricaMesaje fabricaMesaje = new FabricaMesaje();
        Pop pop = (Pop) fabricaMesaje.createMesaj(TipMesaj.POP);
        Rock rock = (Rock)  fabricaMesaje.createMesaj(TipMesaj.ROCK);
        pop.mesajePantofi();
        rock.mesajePantofi();

        //Prototype
        PrototypeMesaje listaMesaje = new MesajePantofi();
        PrototypeMesaje listaMesaje2 = listaMesaje.cloneaza();

        System.out.println(listaMesaje.toString());
        System.out.println(listaMesaje2.toString());


    }
}