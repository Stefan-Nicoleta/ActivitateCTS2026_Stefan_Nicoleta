package structurale.facade.A6_Spital;

public class Pacient {
    private int gravitate;
    private String numePacient;


    public Pacient(int gravitate, String numePacient) {
        this.gravitate = gravitate;
        this.numePacient = numePacient;
    }

    public int getGravitate() {
        return gravitate;
    }
}
