package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    //modificam din an_Studii in anStudii
    //respecta lowerCaseCamel
    protected int anStudii;
    private static int sumaFinantare = 20;

    public String getFacultate() {
        return facultate;
    }
    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
    public int getAnStudii() {
        return anStudii;
    }
    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }


    public Student() {
        super();

    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int anStudii) {
        super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    //DRY!
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("facultate='").append(facultate).append('\'');
        sb.append(", anStudii=").append(anStudii);
        sb.append('}');
        return sb.toString();
    }

    public void afisareFinantare() {
//        int s=20;
        System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+Student.sumaFinantare+" Euro/zi in proiect.");
//        return s;
    }

}