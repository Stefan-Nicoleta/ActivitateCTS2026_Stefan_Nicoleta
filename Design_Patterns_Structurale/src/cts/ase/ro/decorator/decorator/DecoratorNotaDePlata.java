package cts.ase.ro.decorator.decorator;

import cts.ase.ro.decorator.clase.INotaDePlata;

//Decorator
public abstract class DecoratorNotaDePlata implements INotaDePlata {
    // - produsDecorator: ProdusAbstract;
    private INotaDePlata notaDePlata;

    //+operatie()
    //public operatie(){ produsDecorat.operatie();}
    public void printeazaNota(){
        notaDePlata.printeazaNota();
    }

    //+metoda()
    public abstract void printeazaFelicitare();
}
