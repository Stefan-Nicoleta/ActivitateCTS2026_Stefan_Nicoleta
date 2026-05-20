package B5_Adapter;

public class Adaptor extends LucruBar{
    private ProduseBucatarie produseBucatarie;


    public Adaptor(ProduseBucatarie produseBucatarie) {
        super(produseBucatarie.getNumeProduse(), produseBucatarie.getNrProduseVandute());
        this.produseBucatarie = produseBucatarie;
    }

    public void bauturiBar(){
        produseBucatarie.produseVanduteAstazi();
    }
}
