package B16_Chain;

public class NumarTelefon extends HandlerClient {



    @Override
    public void setHandler(HandlerClient handler) {
        super.setHandler(handler);
    }



    public String metodaGestionareCerere(int nrTelefon, String email){
        if(nrTelefon!=0){
            return "Mesaj trimis prin SMS";
        }
        else{
             return this.handler.metodaGestionareCerere(nrTelefon,email);
        }
    }


}
