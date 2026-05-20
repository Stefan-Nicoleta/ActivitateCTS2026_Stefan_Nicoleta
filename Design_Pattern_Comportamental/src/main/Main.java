package main;

import cts.ase.ro.chain.*;
import cts.ase.ro.strategy.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //4.Strategy
        SustinereExamen sustinereExamen = new ProbaGrila();
        SustinereExamen sustinereExamen2 = new ProbaOrala();
        SustinereExamen sustinereExamen3 = new ProbaScrisa();


        Student student = new Student();
        student.setSustinereExamen(sustinereExamen2);
        student.sustienereaExamenului();


        sustinereExamen.tipExamen();
        sustinereExamen2.tipExamen();
        sustinereExamen3.tipExamen();



        //5. Chain of Responsability


        Handler handler = new Autobuz();
        Handler handler1 = new Troleibuz();
        Handler handler2 = new Tramvai();
        Handler handler3 = new Metrou();

        handler.setHandler(handler1);
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        System.out.println(handler.gestioneazaCerere(9));



    }
}