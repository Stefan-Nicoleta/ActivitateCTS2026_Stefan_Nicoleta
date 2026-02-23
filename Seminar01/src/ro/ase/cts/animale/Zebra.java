package ro.ase.cts.animale;

public class Zebra extends Animal{

    private int nrDungi;

    @Override
    public void eat(String numeZooKeeper) {
        System.out.println("ZooKeeperul "+ numeZooKeeper+ " hraneste " +super.name+ " cu "+ super.food);
    }

    public Zebra(String name, int age,String food, int nrDungi) {
        super(name, age, food);
        this.nrDungi = nrDungi;
    }
}