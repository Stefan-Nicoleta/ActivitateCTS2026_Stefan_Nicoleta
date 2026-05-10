package cts.ase.ro.decorator.decorator;

import cts.ase.ro.decorator.clase.INotaDePlata;

import java.time.LocalDate;

public class NotaDePlataFelicitare extends NotaDePlataDecorator {

    public NotaDePlataFelicitare(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani " + (LocalDate.now().getYear() + 1) + "!");
    }
}