package A10_FlyWeight;

public class Pacient implements IPacient {

    private String numePacient;
    private int nrTelefon;

    public Pacient(String numePacient, int nrTelefon) {
        this.numePacient = numePacient;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public void retinereInformatii(Salon salon) {
        System.out.println("Paientul "+this.numePacient+" cu nr de tel "+this.nrTelefon+" este internat in "+salon.getNrSalon()+" "+salon.getNrPaturi());
    }
}
