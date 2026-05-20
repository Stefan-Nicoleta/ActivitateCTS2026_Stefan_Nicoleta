package test2.cts.Stefan.Nicoleta.g1096.pattern.proxy;

public class Hala implements Interfata {
    private Interfata interfata;
    private int temperaturaInterna;
    private int temperaturaExterna;
    private int consumMaximEnergie;
    private int consumMinimEnergie;

    public Hala(Interfata interfata, int temperaturaInterna, int temperaturaExterna, int consumMaximEnergie, int consumMinimEnergie) {
        this.interfata = interfata;
        this.temperaturaInterna = temperaturaInterna;
        this.temperaturaExterna = temperaturaExterna;
        this.consumMaximEnergie = consumMaximEnergie;
        this.consumMinimEnergie = consumMinimEnergie;
    }

    @Override
    public void proceseazaPlaca() {
        if(this.temperaturaInterna>10) {
            System.out.println("Temperatura din hala nu este in intervalul permis");

            if (this.consumMaximEnergie > 99) {
                System.out.println("Consumul de energie nu este in limite bune");

            }
        }
        else{
            interfata.proceseazaPlaca();
        }
    }

    public void esteTemperaturaOk() {
        if(temperaturaInterna>5 && temperaturaInterna<10){
            System.out.println("Temperatura ok");
        }
    }

    public void consumOK(){
        if(consumMaximEnergie<100){
            System.out.println("Consum ok");
        }
    }

}
