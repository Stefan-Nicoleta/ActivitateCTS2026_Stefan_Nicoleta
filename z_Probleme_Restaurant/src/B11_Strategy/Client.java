package B11_Strategy;

public class Client {
    private IModPlata iModPlata;

    public void setiModPlata(IModPlata iModPlata) {
        this.iModPlata = iModPlata;
    }

    public void modDePlata(){
        iModPlata.alegereMetodaPlata();
    }

}
