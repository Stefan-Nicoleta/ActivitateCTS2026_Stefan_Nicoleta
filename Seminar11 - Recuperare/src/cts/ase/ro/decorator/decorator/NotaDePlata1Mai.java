package cts.ase.ro.decorator.decorator;

import cts.ase.ro.decorator.clase.INotaDePlata;

public class NotaDePlata1Mai extends NotaDePlataDecorator {

    public NotaDePlata1Mai(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 mai! Spor la mici!");
    }
}
