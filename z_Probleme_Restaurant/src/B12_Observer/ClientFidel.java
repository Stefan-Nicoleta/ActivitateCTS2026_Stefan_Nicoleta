package B12_Observer;


//ObservatorA
public class ClientFidel implements IClient {
    private String numeClient;

    public ClientFidel(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void notificaClientiFideli(String mesaj) {
        System.out.println("Clientul "+this.numeClient+" a primit urmatorul mesaj: "+mesaj);
    }
}
