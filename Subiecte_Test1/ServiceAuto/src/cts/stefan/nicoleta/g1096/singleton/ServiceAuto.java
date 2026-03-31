package cts.stefan.nicoleta.g1096.singleton;

public class ServiceAuto implements IService{

    //Singleton
    private String locatie;
    private int pret;
    private String orar;

    private ServiceAuto(String locatie, int pret, String orar) {
        this.locatie = locatie;
        this.pret = pret;
        this.orar = orar;
    }


    private static ServiceAuto instanta = null;

    @Override
    public void primesteMasina(AMasina masina) {
        System.out.println("Masina "+masina.denumireMasina + " de culoare "+ masina.culoare);
    }

    public static ServiceAuto getInstance(String denumire, int pret, String orar){
        if(instanta == null){
            instanta = new ServiceAuto(denumire,pret,orar);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServiceAuto{");
        sb.append("locatie='").append(locatie).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", orar='").append(orar).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
