package structurale.adapter.F4_STB;

public class Adapter extends Metrou{

    private Autobuz autobuz;

    public Adapter(Autobuz autobuz) {
        super(autobuz.getLinieAutobuz());
        this.autobuz = autobuz;
    }

    public void valideazaCartela(){
        autobuz.valideazaAbonament();
    }
}
