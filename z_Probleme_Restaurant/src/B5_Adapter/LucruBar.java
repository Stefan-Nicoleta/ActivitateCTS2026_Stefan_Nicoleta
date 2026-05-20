package B5_Adapter;


//Clasa Noua
public class LucruBar {
    private String numeAngajatiBar;
    private int bauturiVandute;

    public LucruBar(String numeAngajatiBar, int bauturiVandute) {
        this.numeAngajatiBar = numeAngajatiBar;
        this.bauturiVandute = bauturiVandute;
    }

    public void bauturiBar(){
        System.out.println(this.numeAngajatiBar+ " a vandut "+this.bauturiVandute+" bauturi");
    }


}
