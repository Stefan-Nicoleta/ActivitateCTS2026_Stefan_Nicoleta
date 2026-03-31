package cts.stefan.nicoleta.g1096.singleton;

public abstract class AMasina {
    public String denumireMasina;
    public String culoare;

    public AMasina(String denumireMasina, String culoare) {
        this.denumireMasina = denumireMasina;
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("denumireMasina='").append(denumireMasina).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
