package B16_Chain;

public class Email extends HandlerClient{
    @Override
    public void setHandler(HandlerClient handler) {
        super.setHandler(handler);
    }


    public String metodaGestionareCerere(int nrTelefon, String email){
        if(!email.isEmpty() && email!=null){
            return "Mesaj trimis prin email";
        }
        else{
            return this.handler.metodaGestionareCerere(nrTelefon,email);
        }
    }

}
