package B8_Composite;

public class ProdusMeniu implements IMeniu{
    private String numeProdus;

    public ProdusMeniu(String numeProdus) {
        this.numeProdus = numeProdus;
    }



    public void afisareOptiuni(){
        System.out.println(this.numeProdus);
    }
}
