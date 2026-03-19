package ro.ase.cts.program;

import ro.ase.cts.A_factoryMethod.clase.FelDeMancare;
import ro.ase.cts.A_factoryMethod.enums.TipDesert;
import ro.ase.cts.A_factoryMethod.enums.TipSupa;
import ro.ase.cts.A_factoryMethod.fabrici.FabricaDesert;
import ro.ase.cts.A_factoryMethod.fabrici.FabricaFelDeMancare;
import ro.ase.cts.A_factoryMethod.fabrici.FabricaSupa;
import ro.ase.cts.B_prototype.clase.PrototypeRezervare;
import ro.ase.cts.B_prototype.clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Problema 1");
        //Cerinta A Factory Method
        FabricaFelDeMancare fabricaSupa = new FabricaSupa();
        FelDeMancare supaDeVita = fabricaSupa.creeareFelDeMancare(TipSupa.SupaDeVita,200,32);
        FelDeMancare supaDeLegume = fabricaSupa.creeareFelDeMancare(TipSupa.SupaDeLegume,325,60);

        FabricaFelDeMancare fabricaDesert = new FabricaDesert();
        FelDeMancare clatite = fabricaDesert.creeareFelDeMancare(TipDesert.Clatite,125,18);
        FelDeMancare papanasi = fabricaDesert.creeareFelDeMancare(TipDesert.Papanasi,100,23.5);


        supaDeLegume.afisareDescriere();
        supaDeVita.afisareDescriere();
        clatite.afisareDescriere();
        papanasi.afisareDescriere();
        System.out.println();

        //Cerinta B Prototype
        System.out.println("Problema 2");
        PrototypeRezervare rezervare = new Rezervare("Nicoleta", 2,"17:30", "+403737373");
        PrototypeRezervare rezervare1 = rezervare.copiaza();

        //rezervare si rezervare1 au aceiasi ora de rezervare
        //vom schimba ora rezervarii 1

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());

        System.out.println();


        ((Rezervare) rezervare1).setOraRezervare("14:15");
        ((Rezervare) rezervare1).setNrPersoane(5);

        System.out.println(rezervare.toString());
        System.out.println(rezervare1.toString());
    }
}