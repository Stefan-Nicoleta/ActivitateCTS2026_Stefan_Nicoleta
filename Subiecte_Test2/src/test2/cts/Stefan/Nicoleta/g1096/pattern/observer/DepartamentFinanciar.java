package test2.cts.Stefan.Nicoleta.g1096.pattern.observer;

public class DepartamentFinanciar implements Departament{
    private String numeAngajat;

    public DepartamentFinanciar(String numeAngajat) {
        this.numeAngajat = numeAngajat;
    }

    @Override
    public void notificaDepartament(String mesaj) {
        System.out.println("Angajatul "+this.numeAngajat+" de la departamentul financiar "+" a primit mesajul: "+mesaj);
    }
}
