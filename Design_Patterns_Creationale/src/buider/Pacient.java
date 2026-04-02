package buider;

public class Pacient {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;

     Pacient(boolean patRabatabil, boolean micDejunInclus, boolean papuciCamera) {
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCamera = papuciCamera;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejunInclus=").append(micDejunInclus);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append('}');
        return sb.toString();
    }
}
