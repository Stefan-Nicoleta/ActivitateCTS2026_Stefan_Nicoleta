package structurale.adapter.F4_STB;


//Clasa Noua
public class Metrou {
    private String culoareLinie;

    public Metrou(String culoareLinie) {
        this.culoareLinie = culoareLinie;
    }



    public void valideazaCartela(){
        System.out.println("Cartela de pe "+this.culoareLinie+" este validat!");
    }

}
