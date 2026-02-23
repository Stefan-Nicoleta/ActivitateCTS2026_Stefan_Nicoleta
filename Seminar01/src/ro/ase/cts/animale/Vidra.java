package ro.ase.cts.animale;

public class Vidra extends Animal{

    private String tipMediu;

    @Override
    public void eat(String nume) {
        System.out.println("Zookeeperul "+nume+" a hranit vidra "+super.name+" cu "+super.food);
    }

    public Vidra(String name, int age, String food, String tipMediu) {
        super(name, age, food);
        this.tipMediu = tipMediu;
    }
}
