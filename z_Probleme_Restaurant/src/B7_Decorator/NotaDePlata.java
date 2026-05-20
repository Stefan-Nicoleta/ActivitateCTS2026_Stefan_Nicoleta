package B7_Decorator;


//Clasa Concreta
public class NotaDePlata implements  INotaDePlata{

    private String numeCLient;

    public NotaDePlata(String numeCLient) {
        this.numeCLient = numeCLient;
    }

    @Override
    public void detaliiNotaDePlata() {
        System.out.println("Aceasta este nota de plata a clientului "+this.numeCLient);
    }
}
