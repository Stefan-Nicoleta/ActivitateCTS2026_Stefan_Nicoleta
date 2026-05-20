package B6_Facade;

public class Facade {


    private MasaDebarasata masaDebarasata;
    private ServeteleNoi serveteleNoi;
    private MasaLibera masaLibera;

    public Facade() {
        this.masaDebarasata = new MasaDebarasata("Masa 4 ");
        this.serveteleNoi = new ServeteleNoi(6);
        this.masaLibera = new MasaLibera();
    }

    public void masaLibera(){
        if(masaDebarasata.getNrMasa().contains("eliberat") && serveteleNoi.getNrServeteleLaMasa()!=0){
            masaLibera.masaLibera();
        }
        else{
            System.out.println("Masa nu este inca libera");
        }
    }

}
