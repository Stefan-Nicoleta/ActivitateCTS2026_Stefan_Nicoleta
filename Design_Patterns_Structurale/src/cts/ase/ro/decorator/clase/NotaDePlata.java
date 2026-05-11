package cts.ase.ro.decorator.clase;

//Produs Concret
public class NotaDePlata implements INotaDePlata{
   //+operatie();
    @Override
    public void printeazaNota() {
        System.out.println("La Multi Ani!");
    }
}
