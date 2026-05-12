package main;

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
    }
}