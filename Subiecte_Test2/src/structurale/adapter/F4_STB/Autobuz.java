package structurale.adapter.F4_STB;



//Clasa existenta
public class Autobuz {
    private String linieAutobuz;

    public Autobuz(String linieAutobuz) {
        this.linieAutobuz = linieAutobuz;
    }

    public String getLinieAutobuz() {
        return linieAutobuz;
    }

    public void valideazaAbonament(){
        System.out.println("Cartela pentru linia: "+this.linieAutobuz+" a fost validata cu succes!");
    }
}
