package structurale.adapter.B5_Restaurant;

public class Adaptor extends LucruBar{

    private ProduseBucatarie produseBucatarie;


    public Adaptor(String numeAngajati, int nrBauturi, ProduseBucatarie produseBucatarie) {
        super(numeAngajati, nrBauturi);
        this.produseBucatarie = produseBucatarie;
    }

    public void bauturiPreparate(){
        produseBucatarie.detaliiBauturi();
    }


}
