package A8_Composite;

public class Sectii implements IDepartamente {

    private String numeSectie;

    public Sectii(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sectii{");
        sb.append("numeSectie='").append(numeSectie).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaSectii() {
        System.out.println("Nume: "+this.numeSectie);
    }
}
