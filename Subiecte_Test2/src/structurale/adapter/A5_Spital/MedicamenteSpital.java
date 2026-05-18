package structurale.adapter.A5_Spital;


//Clasa Existenta
public class MedicamenteSpital {
    private String denumrieMedicament;

    public MedicamenteSpital(String denumrieMedicament) {
        this.denumrieMedicament = denumrieMedicament;
    }

    //verificarea retetei
    public void achizitioneazaMedicament(){
        if(this.denumrieMedicament.contains("reteta")){
            prezintaReteta();
        }
        else{
            System.out.println("Nu putem sa vindem acest produs fara reteta");
        }
    }


    public void prezintaReteta(){
        System.out.println("Medicamentul "+this.denumrieMedicament+" are reteta!");
    }
}
