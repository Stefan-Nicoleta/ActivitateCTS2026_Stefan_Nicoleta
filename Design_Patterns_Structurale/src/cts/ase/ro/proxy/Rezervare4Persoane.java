package cts.ase.ro.proxy;


//Proxy
public class Rezervare4Persoane implements IRezervare{
    private IRezervare iRezervare;
    private int nrPersoane;

    public Rezervare4Persoane(IRezervare iRezervare, int nrPersoane) {
        this.iRezervare = iRezervare;
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void aprobareRezervare() {
        if(this.nrPersoane < 4){
            System.out.println("Nu aveti nevoie de rezervare pentru "+this.nrPersoane+" persoane");
        }
        else{
            iRezervare.aprobareRezervare();
        }
    }
}
