package proxy;

public class AutobuzCursaSpeciala implements MijlocTransport{
    private MijlocTransport mijlocTransport;

    @Override
    public void oprireStatie() {
        if(this.mijlocTransport.getLinie().equalsIgnoreCase("speciala")) {
            System.out.println("Autobuzul nu se poate opri in statie");
            return;
        }
        this.mijlocTransport.oprireStatie();
    }

    @Override
    public int getNrCalatori() {
        return this.mijlocTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        return this.mijlocTransport.getLinie();
    }
}
