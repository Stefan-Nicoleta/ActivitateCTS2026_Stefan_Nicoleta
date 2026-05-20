package B7_Decorator;

public abstract class NotaDePlataDecorator implements INotaDePlata {

   private INotaDePlata iNotaDePlata;

    public NotaDePlataDecorator(INotaDePlata iNotaDePlata) {
        this.iNotaDePlata = iNotaDePlata;
    }

    @Override
    public void detaliiNotaDePlata() {
        iNotaDePlata.detaliiNotaDePlata();
    }


    public void felicitareAnNou(){
        System.out.println("An nou fericit!");
    }

}
