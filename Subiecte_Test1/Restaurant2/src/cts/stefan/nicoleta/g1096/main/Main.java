package cts.stefan.nicoleta.g1096.main;

import cts.stefan.nicoleta.g1096.singleton.model.Cuptor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //un singur cuptor!
        Cuptor cuptor = Cuptor.getInstance();
        Cuptor cuptor2 = Cuptor.getInstance();


        cuptor.adaugaInLista("Clatite", 20,302);
        cuptor.adaugaInLista("PAPANASI", 20,302);

        cuptor.afiseazaLista();
        cuptor2.afiseazaLista();



    }
}