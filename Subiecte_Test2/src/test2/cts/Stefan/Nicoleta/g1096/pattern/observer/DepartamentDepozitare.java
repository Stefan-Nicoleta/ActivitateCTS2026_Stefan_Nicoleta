package test2.cts.Stefan.Nicoleta.g1096.pattern.observer;

public class DepartamentDepozitare implements Departament{

    private String numeAngajat;

    public DepartamentDepozitare(String numeAngajat) {
        this.numeAngajat = numeAngajat;
    }

    @Override
    public void notificaDepartament(String mesaj) {
        System.out.println("Angajatul "+this.numeAngajat+" de la departamentul depozitare "+" a primit mesajul: "+mesaj);
    }
}
