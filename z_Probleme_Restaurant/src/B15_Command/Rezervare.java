package B15_Command;

public class Rezervare implements IComanda{

    private Masa masa;

    public Rezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.detaliiMasa();
    }
}
