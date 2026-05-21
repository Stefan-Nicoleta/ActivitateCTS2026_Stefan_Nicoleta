package A11_Strategy;

public class Pacient {
    private IPlata iPlata;

    public Pacient(IPlata iPlata) {
        this.iPlata = iPlata;
    }

    public void setiPlata(IPlata iPlata) {
        this.iPlata = iPlata;
    }

    public void metodaPlata(){
        iPlata.alegeModDePlata();
    }

}
