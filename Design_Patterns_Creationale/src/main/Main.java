package main;

import buider.Pacient;
import buider.PacientBuilder;
import simpleFactory.Asistent;
import simpleFactory.FabricaPersonal;
import simpleFactory.TipPersonal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //builder
        Pacient p = new PacientBuilder().setMicDejunInclus(true).setPatRabatabil(true).build();
        System.out.println(p.toString());
        //simple factory


        Asistent asistent = (Asistent) FabricaPersonal.createPersonal(TipPersonal.ASISTENT);

        System.out.println(asistent);

    }
}