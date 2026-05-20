package B9_Proxy;

public class RezervareMinimi4Persoane implements IRezervare{
    private int nrPersoane;
    private IRezervare iRezervare;

    public RezervareMinimi4Persoane(int nrPersoane, IRezervare iRezervare) {
        this.nrPersoane = nrPersoane;
        this.iRezervare = iRezervare;
    }

    @Override
    public void detaliiRezervare() {
        if(this.nrPersoane>=4){
            this.iRezervare.detaliiRezervare();
        }
        else{
            System.out.println("Nu s-a putut face rezervarea pentru"+this.nrPersoane);
        }
    }
}
