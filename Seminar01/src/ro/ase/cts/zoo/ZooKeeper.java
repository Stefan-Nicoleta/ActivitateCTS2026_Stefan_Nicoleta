package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

public class ZooKeeper{

    private String name;

    public void feedAnimal(Animal animal){
        animal.eat(name);
    }

    public ZooKeeper(String name) {
        this.name = name;
    }
}
