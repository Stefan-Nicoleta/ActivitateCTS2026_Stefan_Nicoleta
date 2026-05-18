package structurale.adapter.B5_Restaurant;

public class Main {
    public static void main(String[] args) {

    ProduseBucatarie produseBucatarie = new ProduseBucatarie("Faina");
    LucruBar adaptor = new Adaptor("Nicoleta",15,produseBucatarie);
    LucruBar lucruBar = new LucruBar("Ana",20);

    produseBucatarie.detaliiBauturi();
    adaptor.bauturiPreparate();
    lucruBar.bauturiPreparate();


    }
}