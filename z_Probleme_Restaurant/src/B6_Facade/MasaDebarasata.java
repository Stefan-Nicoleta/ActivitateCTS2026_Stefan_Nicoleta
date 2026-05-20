package B6_Facade;

public class MasaDebarasata {

    private String nrMasa;

    public MasaDebarasata(String nrMasa) {
        this.nrMasa = nrMasa;
    }

    public String getNrMasa() {
        return nrMasa;
    }

    public void masaDebarasata(){
        System.out.println("Masa a fost debarasata");
    }
}
