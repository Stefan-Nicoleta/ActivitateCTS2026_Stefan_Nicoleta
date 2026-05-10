package cts.ase.ro.decorator.clase;

public class NotaDePlata implements INotaDePlata {
    private double suma;
    private String data;

    @Override
    public void printeaza() {
        System.out.println("La data de " + this.data + " a fost emisa o plata de " + this.suma + " lei!");
    }

    public NotaDePlata(double suma, String data) {
        this.suma = suma;
        this.data = data;
    }
}
