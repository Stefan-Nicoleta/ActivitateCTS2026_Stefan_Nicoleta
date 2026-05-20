package B5_Adapter;


//Clasa Existenta
public class ProduseBucatarie {
    private String numeProduse;
    private int nrProduseVandute;


    public ProduseBucatarie(String numeProduse, int nrProduseVandute) {
        this.numeProduse = numeProduse;
        this.nrProduseVandute = nrProduseVandute;
    }

    public String getNumeProduse() {
        return numeProduse;
    }

    public int getNrProduseVandute() {
        return nrProduseVandute;
    }

    public void produseVanduteAstazi(){
        System.out.println("Astazi s-au vandut "+this.nrProduseVandute+" de "+this.numeProduse);
    }


}
