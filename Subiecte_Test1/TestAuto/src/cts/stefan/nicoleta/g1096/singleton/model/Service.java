package cts.stefan.nicoleta.g1096.singleton.model;

public class Service implements IService{
    //aici aplicam singleton

    private String denumireService;
    private int pret;

    private static Service instanta = null;
private AMasina masinaReparare = null;


    private Service(String denumireService, int pret) {
        this.denumireService = denumireService;
        this.pret = pret;
    }

    public static Service getInstance(String denumireService, int pret){
        if(instanta == null){
            instanta = new Service(denumireService,pret);
        }
        return instanta;
    }


    public void acceptareMasina(AMasina aMasina){
        if(masinaReparare == null){
            this.masinaReparare = aMasina;
            System.out.println("Masina acceptata");
        }
        else{
            System.out.println("Loc ocupat");
        }
    }


    public void eliberareLoc(){
        if(masinaReparare == null){
            System.out.println("Locul este deja gol");
        }
        else{
            System.out.println("Loc eliberat cu succes");
            this.masinaReparare = null;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Service{");
        sb.append("denumireService='").append(denumireService).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Service auto "+this.denumireService+".Serviciul costa "+this.pret);
    }


}
