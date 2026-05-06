package cts.ase.ro.command.clase;

public class Autobuz {
    private String producator;
    private int nrInmatriculare;


    public Autobuz(String producator, int nrInmatriculare) {
        this.producator = producator;
        this.nrInmatriculare = nrInmatriculare;
    }

    public void pornestePeTraseu(int nrLinie){
        System.out.println("Autobuzul "+this.producator+" Mercedes porneste pe traseul "+nrLinie);
    }
}
