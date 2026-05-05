package cts.ase.ro.main;

import cts.ase.ro.command.clase.*;
import cts.ase.ro.observer.clase.ISpital;
import cts.ase.ro.observer.clase.Pacient;
import cts.ase.ro.observer.clase.PacientAbonat;
import cts.ase.ro.observer.clase.Spital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Problema A12");
        System.out.println();
        //Problema Observer
        Pacient pacient1 = new PacientAbonat("Nicoleta",21);
        Pacient pacient2 = new PacientAbonat("Razvan",21);
        Pacient pacient3 = new PacientAbonat("Mami si Tati",50);


        ISpital spital = new Spital("Spital1");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital)spital).notificaVirus();
        System.out.println("================================");
        ((Spital)spital).notificaEpidemie();


        //Problema Command
        System.out.println();
        System.out.println("Problema A15");
        System.out.println();
        PersonalSpital medic = new Medic("Fifi");
        PersonalSpital asistenta = new Asistenta("Chloe");
        cts.ase.ro.command.clase.Pacient pacient4=new cts.ase.ro.command.clase.Pacient("Nicoleta");
        cts.ase.ro.command.clase.Pacient pacient5=new cts.ase.ro.command.clase.Pacient("Cristi");
        cts.ase.ro.command.clase.Pacient pacient6=new cts.ase.ro.command.clase.Pacient("Pusa");

        IComanda comanda1 = new Internare(medic,pacient4);
        IComanda comanda2 = new Tratare(asistenta,pacient5);
        IComanda comanda3 = new Internare(medic,pacient6);

        Operator operator = new Operator();
        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);
        operator.inregistreaza(comanda3);

        operator.executaFisa();
        operator.executaFisa();
        operator.executaFisa();

        System.out.println("----------------------");
        System.out.println("sau");
        System.out.println("----------------------");
        operator.inregistreaza(new Tratare(asistenta,new cts.ase.ro.command.clase.Pacient("Cineva")));
        operator.executaFisa();



    }

}