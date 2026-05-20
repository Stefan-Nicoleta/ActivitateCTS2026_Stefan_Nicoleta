package B16_Chain;

public abstract class HandlerClient {
    protected HandlerClient handler;

    public HandlerClient() {
        this.handler = null;
    }

    public void setHandler(HandlerClient handler) {
        this.handler = handler;
    }

    public String metodaGestionareCerere(int nrTelefon, String email){
        return null;
    }


}
