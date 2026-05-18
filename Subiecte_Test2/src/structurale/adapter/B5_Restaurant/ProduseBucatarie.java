package structurale.adapter.B5_Restaurant;


//Clasa Existenta
public class ProduseBucatarie {
    private String denumireProduse;

    public ProduseBucatarie(String denumireProduse) {
        this.denumireProduse = denumireProduse;
    }



    public void detaliiBauturi(){
        System.out.println(this.denumireProduse+" a fost preparata astazi");
    }
}
