package ro.ase.cts;

import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Vidra;
import ro.ase.cts.zoo.ZOO;
import ro.ase.cts.zoo.ZooKeeper;

public class Seminar1 {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper("Popescu");

        ZOO zoo = new ZOO("Baneasa",keeper);
        zoo.addAnimal(new Lion("Leul",2,"carne", 100));
        zoo.addAnimal(new Lion("Leul2",3,"carne",150));
        zoo.addAnimal(new Lion("Zebra1",5,"fan",100));
        zoo.addAnimal(new Lion("Zebra2",2,"iarba",230));
        zoo.addAnimal(new Vidra("Vidra1", 3, "peste", "lac"));

        zoo.feedAllAnimals();
    }
}
