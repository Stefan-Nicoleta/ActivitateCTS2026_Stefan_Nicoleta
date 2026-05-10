package cts.ase.ro.main;

import cts.ase.ro.composite.Departament;
import cts.ase.ro.composite.Sectie;
import cts.ase.ro.composite.Structura;
import cts.ase.ro.decorator.clase.INotaDePlata;
import cts.ase.ro.decorator.clase.NotaDePlata;
import cts.ase.ro.decorator.decorator.NotaDePlata1Mai;
import cts.ase.ro.decorator.decorator.NotaDePlataDecorator;
import cts.ase.ro.decorator.decorator.NotaDePlataFelicitare;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //1. Decorator
        INotaDePlata notaDePlata = new NotaDePlata(150,String.valueOf(LocalDate.now()));
        notaDePlata.printeaza();
        int a = 1;
        NotaDePlataDecorator notaDePlataDecorator = (a == 1) ?  new NotaDePlataFelicitare(notaDePlata) : new NotaDePlata1Mai(notaDePlata);
        notaDePlataDecorator.printeazaFelicitare();
        System.out.println();
    //2 Composite
        Structura spital = new Departament("Spital");
        Structura administrativ = new Departament("Administrativ");
        Structura secretariat = new Sectie("Secretariat",9);
        Structura management = new Sectie("Management",2);

        ((Departament)spital).adaugaStructua(administrativ);
        ((Departament)spital).adaugaStructua(management);
        ((Departament)administrativ).adaugaStructua(secretariat);

        spital.afiseazaDetaliiStructura("  ");

        ((Departament) spital).stergeStructura(management);
        ((Departament)administrativ).adaugaStructua(administrativ);




    }
}