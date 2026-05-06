package cts.ase.ro.strategy.clase;

public class Student {
    private ModSustinere modSustinere;
    private String nume;

    public Student(ModSustinere modSustinere, String nume) {
        this.modSustinere = modSustinere;
        this.nume = nume;
    }

    public Student() {
        this.modSustinere = new ProbaGrila(); //implicit, examenul este grila
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare(){
        this.modSustinere.sustinereExamen();
    }


}
