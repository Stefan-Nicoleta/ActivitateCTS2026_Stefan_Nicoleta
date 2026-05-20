package test2.cts.Stefan.Nicoleta.g1096.pattern.proxy;

public class UtilajPlaci implements Interfata{

    private String tipLemn;
    private int suprafataPrelucrata;
    private int grosime;
    private int cost;

    public UtilajPlaci(String tipLemn, int suprafataPrelucrata, int grosime, int cost) {
        this.tipLemn = tipLemn;
        this.suprafataPrelucrata = suprafataPrelucrata;
        this.grosime = grosime;
        this.cost = cost;
    }
    @Override
    public void proceseazaPlaca() {
        System.out.println("Placile sunt: "+this.tipLemn+" au suprafata de "+this.suprafataPrelucrata+" ,grosimea: "+this.grosime+" si costa "+this.cost);
    }
}
