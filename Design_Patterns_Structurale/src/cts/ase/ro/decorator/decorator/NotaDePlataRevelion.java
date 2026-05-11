package cts.ase.ro.decorator.decorator;

//DecoratorConcretA
public class NotaDePlataRevelion extends DecoratorNotaDePlata{

    //+metodaNoua();
    @Override
    public void printeazaFelicitare() {
        System.out.println("Revelion!");
    }
}
