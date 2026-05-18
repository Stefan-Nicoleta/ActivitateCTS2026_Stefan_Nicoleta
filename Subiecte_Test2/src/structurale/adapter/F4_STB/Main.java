package structurale.adapter.F4_STB;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("31");
        Adapter adapter = new Adapter(autobuz);
        adapter.valideazaCartela();

        autobuz.valideazaAbonament();
    }
}
