package test2.cts.Stefan.Nicoleta.g1096.pattern.observer;

public class DepartamentTransport implements Departament{
    private String numeAngajat;

    public DepartamentTransport(String numeAngajat) {
        this.numeAngajat = numeAngajat;
    }

    @Override
    public void notificaDepartament(String mesaj) {
        System.out.println("Angajatul "+this.numeAngajat+" de la departamentul transport "+" a primit mesajul: "+mesaj);
    }
}
