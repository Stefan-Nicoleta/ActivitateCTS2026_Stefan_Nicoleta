package A9_Proxy;

public class Pacient implements ISpital{
    private String nume;



    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void verificareAsigurare() {
        System.out.println("Pacientul "+this.nume+" a fost internat in spital");
    }
}
