package cts.ase.ro.command.clase;

//Executant
public class Autobuz {
    private String producator;
    private int nrInmatriculare;


    public Autobuz(String producator, int nrInmatriculare) {
        this.producator = producator;
        this.nrInmatriculare = nrInmatriculare;
    }


    //+actiune()
    public void pornestePeTraseu(int nrLinie){
        System.out.println("Autobuzul "+this.producator+" Mercedes porneste pe traseul "+nrLinie);
    }
}
