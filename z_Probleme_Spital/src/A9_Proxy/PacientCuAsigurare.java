package A9_Proxy;

public class PacientCuAsigurare implements ISpital{

    private ISpital iSpital;
    private boolean areAsigurare;

    public PacientCuAsigurare(ISpital iSpital, boolean areAsigurare) {
        this.iSpital = iSpital;
        this.areAsigurare = areAsigurare;
    }

    @Override
    public void verificareAsigurare() {
        if(this.areAsigurare){
            iSpital.verificareAsigurare();

        }
        else{
            System.out.println("Internare respinsa!");
        }
    }
}
