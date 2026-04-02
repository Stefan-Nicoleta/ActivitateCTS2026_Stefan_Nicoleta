package simpleFactory;

public class Asistent implements Personal{

    private String scoalaAbsolvita;

    Asistent(String scoalaAbsolvita) {
        this.scoalaAbsolvita = scoalaAbsolvita;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Asistent{");
        sb.append("scoalaAbsolvita='").append(scoalaAbsolvita).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
