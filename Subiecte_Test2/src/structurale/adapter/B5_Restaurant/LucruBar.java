package structurale.adapter.B5_Restaurant;


//Clasa ContextNou
public class LucruBar {
    private String numeAngajati;
    private int nrBauturi;

    public LucruBar(String numeAngajati, int nrBauturi) {
        this.numeAngajati = numeAngajati;
        this.nrBauturi = nrBauturi;
    }

    public void bauturiPreparate(){
        System.out.println(this.numeAngajati+" a preparat "+this.nrBauturi+" astazi");
    }


}
