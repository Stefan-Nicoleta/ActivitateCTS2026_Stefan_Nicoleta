package cts.ase.ro.decorator.decorator;

import cts.ase.ro.decorator.clase.INotaDePlata;

public abstract class NotaDePlataDecorator implements INotaDePlata {
    private INotaDePlata notaDePlata;

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }

    public abstract void printeazaFelicitare();

    public NotaDePlataDecorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }
}
