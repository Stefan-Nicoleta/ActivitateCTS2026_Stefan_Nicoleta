package B7_Decorator;

public class NotaDePlataSfarsitAn extends NotaDePlataDecorator{
    public NotaDePlataSfarsitAn(INotaDePlata iNotaDePlata) {
        super(iNotaDePlata);
    }




    public void detaliiNotaDePlata(){
        super.detaliiNotaDePlata();
        felicitareAnNou();
    }
}
