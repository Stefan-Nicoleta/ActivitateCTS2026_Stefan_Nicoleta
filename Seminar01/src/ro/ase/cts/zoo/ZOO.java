package ro.ase.cts.zoo;

import ro.ase.cts.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String name;
    private ZooKeeper zooKeeper;
    private List<Animal> listaAnimale;

    public ZOO(String name, ZooKeeper zooKeeper) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.listaAnimale = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        listaAnimale.add(animal);
    }


    public void feedAllAnimals(){
        for(Animal a: listaAnimale) //foreach
            zooKeeper.feedAnimal(a);
    }
}
