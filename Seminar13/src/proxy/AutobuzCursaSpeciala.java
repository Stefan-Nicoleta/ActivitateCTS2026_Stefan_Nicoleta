package proxy;


//Proxy
public class AutobuzCursaSpeciala implements MijlocTransport{
    //- entitate: InterfataEntitate
    private MijlocTransport mijlocTransport;


    //+metoda():void
    @Override
    public void oprireStatie() {
        if(this.mijlocTransport.getLinie().equalsIgnoreCase("speciala")) {
            System.out.println("Autobuzul nu se poate opri in statie");
            return;
        }
        //entitate.metoda()
        this.mijlocTransport.oprireStatie();
    }

    @Override
    public int getNrCalatori() {
        //entitate.metoda()
        return this.mijlocTransport.getNrCalatori();
    }

    @Override
    public String getLinie() {
        //entitate.metoda()
        return this.mijlocTransport.getLinie();
    }
}
