package B6_Facade;

public class ServeteleNoi {

    private int nrServeteleLaMasa;

    public ServeteleNoi(int nrServeteleLaMasa) {
        this.nrServeteleLaMasa = nrServeteleLaMasa;
    }

    public int getNrServeteleLaMasa() {
        return nrServeteleLaMasa;
    }

    public void serveteleNoi(){
        System.out.println("La masa sunt servetele noi puse");
    }

}
