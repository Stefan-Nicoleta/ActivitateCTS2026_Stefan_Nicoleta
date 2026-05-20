package B12_Observer;

//ObservabilConcret
public class Restaurant extends RestaurantObservail {
    public void notificaOfertaPret(){
        super.notificaClientFidel("Oferta de pret noua!");
    }

    public void notificaIntroducereMeniuNou(){
        super.notificaClientFidel("Meniu nou!");
    }
}
