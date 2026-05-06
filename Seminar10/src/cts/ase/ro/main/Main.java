package cts.ase.ro.main;

import cts.ase.ro.chain.clase.*;
import cts.ase.ro.command.clase.Autobuz;
import cts.ase.ro.command.clase.ICommand;
import cts.ase.ro.command.clase.Operator;
import cts.ase.ro.command.clase.Plecare;
import cts.ase.ro.strategy.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //problema chain
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setCalatorieHandler(calatorieAutobuz);
        calatorieAutobuz.setCalatorieHandler(calatorieTramvai);
        calatorieTramvai.setCalatorieHandler(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandaCalatorie(5));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(12));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandaCalatorie(4));


        System.out.println();
        //problema strategy

        Student student1 = new Student(new ProbaOrala(),"Nicoleta");
        Student student2 = new Student(new ProbaGrila(),"Flavia");
        Student student3 = new Student(new ProbaScrisa(),"Razvan");

        student1.examinare();
        student2.examinare();
        student3.examinare();


        System.out.println();
        //problema command
        Operator operator = new Operator();
        ICommand comanda1 = new Plecare(new Autobuz("Mercedes",10),381);
        ICommand comanda2 = new Plecare(new Autobuz("Altceva in afara de Mercedes",22),555);
        ICommand comanda3 = new Plecare(new Autobuz("Altceva altceva in afara de Mercedes",44),999);


        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(comanda3);


        //sau

        operator.adaugaComanda(new Plecare(new Autobuz("Dacia",3),100));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda(); //a cincea oara primi eroare! (am pus if si nu mai primit eroare!)

    }
}