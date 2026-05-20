package cts.ase.ro.command.clase;

//Comanda Concreta
public class Plecare implements ICommand{
    //-Executant executant;
    private Autobuz autobuz;
    private int nrLinie;

    public Plecare(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }


    //+executa()
    @Override
    public void pleacaInCursa() {
        autobuz.pornestePeTraseu(nrLinie);
    }
}
