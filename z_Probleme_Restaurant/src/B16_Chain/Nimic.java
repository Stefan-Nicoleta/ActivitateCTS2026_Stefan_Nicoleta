package B16_Chain;

public class Nimic extends HandlerClient{


    @Override
    public void setHandler(HandlerClient handler) {
        super.setHandler(handler);
    }


    public String metodaGestionareCerere(int nrTelefon, String email){
        return "Client nou"+nrTelefon+email;
    }

}
