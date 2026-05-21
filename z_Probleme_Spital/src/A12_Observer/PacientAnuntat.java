package A12_Observer;

public class PacientAnuntat implements IPacient {
    private String nume;


    public PacientAnuntat(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificaPacienti(String mesaj) {
        System.out.println("Pacientul "+this.nume+" a primit urmatorul mesaj: "+mesaj);
    }
}
