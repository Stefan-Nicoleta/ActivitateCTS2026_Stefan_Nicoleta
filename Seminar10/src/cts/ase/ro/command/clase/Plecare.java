package cts.ase.ro.command.clase;

public class Plecare implements ICommand{
    private Autobuz autobuz;
    private int nrLinie;

    public Plecare(Autobuz autobuz, int nrLinie) {
        this.autobuz = autobuz;
        this.nrLinie = nrLinie;
    }

    @Override
    public void pleacaInCursa() {
        autobuz.pornestePeTraseu(nrLinie);
    }
}
