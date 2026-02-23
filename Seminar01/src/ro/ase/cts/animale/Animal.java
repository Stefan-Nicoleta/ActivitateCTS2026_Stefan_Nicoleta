package ro.ase.cts.animale;

//Cream un proiect(SeminarCTS), iar apoi o sa folosim module(Seminar01)
//In module, cream pachete (ro.ase.cts.animale)
//Cream clasele noastre in proiect (Animal, ZOO, ZooKeeper, Lion si Zebra)

//proiectele se scriu numai cu litere mici
//clasele incep mereu cu litera mare

public abstract class Animal {
    protected String name; //-
    private int age; //-

    //+
    public abstract void eat(String nume);

    protected String food;

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }
}

