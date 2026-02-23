package ro.ase.cts.animale;

public class Lion extends Animal{

    private float greutate;

    @Override
    public void eat(String nume) {
        System.out.println("ZooKeeperul "+ nume+ " hraneste "+ super.name+" cu "+ super.food);
    }


    public Lion(String name, int age, String food, float greutate) {
        super(name, age, food);
        this.greutate = greutate;
    }
}
