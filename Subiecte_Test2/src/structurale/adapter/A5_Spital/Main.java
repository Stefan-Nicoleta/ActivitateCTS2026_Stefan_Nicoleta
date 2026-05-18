package structurale.adapter.A5_Spital;

public class Main {
    public static void main(String[] args) {
        MedicamenteSpital medicamenteSpital = new MedicamenteSpital("Nurofen cu reteta");
        Adaptor adaptor = new Adaptor("Nurofen cu reteta",medicamenteSpital);
        adaptor.cumparaMedicament();
    }
}
