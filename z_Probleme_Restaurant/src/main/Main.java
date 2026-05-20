package main;

import B10_Flyweight.FlyweightFactory;
import B10_Flyweight.Rezervari;
import B11_Strategy.Client;
import B11_Strategy.IModPlata;
import B11_Strategy.PlataCard;
import B11_Strategy.PlataCash;
import B12_Observer.ClientFidel;
import B12_Observer.Restaurant;
import B15_Command.Masa;
import B15_Command.Operator;
import B16_Chain.Email;
import B16_Chain.HandlerClient;
import B16_Chain.Nimic;
import B16_Chain.NumarTelefon;
import B5_Adapter.Adaptor;
import B5_Adapter.LucruBar;
import B5_Adapter.ProduseBucatarie;
import B6_Facade.Facade;
import B6_Facade.MasaDebarasata;
import B6_Facade.MasaLibera;
import B6_Facade.ServeteleNoi;
import B7_Decorator.INotaDePlata;
import B7_Decorator.NotaDePlata;
import B7_Decorator.NotaDePlataDecorator;
import B7_Decorator.NotaDePlataSfarsitAn;
import B8_Composite.*;
import B9_Proxy.IRezervare;
import B9_Proxy.Rezervare;
import B9_Proxy.RezervareMinimi4Persoane;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //1. B5 - Adaptor
        ProduseBucatarie produseBucatarie = new ProduseBucatarie("Tequila",5);
        LucruBar lucruBar = new LucruBar("Nicoleta",10);
        Adaptor adaptor= new Adaptor(produseBucatarie);
        adaptor.bauturiBar();
        lucruBar.bauturiBar();



        //2. B6 - Facade
        Facade facade = new Facade();
        facade.masaLibera();



        //3. B7 - Decorator
        INotaDePlata iNotaDePlata = new NotaDePlata("Nicoleta");
        iNotaDePlata.detaliiNotaDePlata();

        INotaDePlata iNotaDePlata1 = new NotaDePlataSfarsitAn(iNotaDePlata);
        iNotaDePlata1.detaliiNotaDePlata();


        //4. B8 - Composite
        Meniu meniu = new Meniu("Fel principal");
        Meniu bauturi = new Meniu("Bauturi");
        Meniu startere = new Meniu("Startere");
        Meniu desert = new Meniu("Desert");

        IMeniu suc = new ProdusMeniu("Suc");
        IMeniu cafea = new ProdusMeniu("Cafea");



        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(startere);
        meniu.adaugaNod(desert);

        bauturi.adaugaNod(suc);
        bauturi.adaugaNod(cafea);

        meniu.afisareOptiuni();


        //B9 - Proxy
        IRezervare iRezervare = new Rezervare();
        IRezervare rezervare = new RezervareMinimi4Persoane(10,iRezervare);
        rezervare.detaliiRezervare();

        //B10 - Flyweight
      FlyweightFactory flyweightFactory = new FlyweightFactory();
        Rezervari rezervari = new Rezervari(4,3,"a9");
        B10_Flyweight.IRezervare iRezervare1 = flyweightFactory.getDetaliiClient("Nicoleta",985795,"sfnsd");
        B10_Flyweight.IRezervare iRezervare2 = flyweightFactory.getDetaliiClient("Nicoleta",985795,"sfnsd");
        B10_Flyweight.IRezervare iRezervare3 = flyweightFactory.getDetaliiClient("kdsnkf",985795,"sfnsd");
        iRezervare1.detaliiRezervare(rezervari);
        iRezervare2.detaliiRezervare(rezervari);
        iRezervare3.detaliiRezervare(rezervari);



        //B16 - Chain
        HandlerClient nrTelefon = new NumarTelefon();
        HandlerClient email= new Email();
        HandlerClient nimic = new Nimic();


      nrTelefon.setHandler(email);
      email.setHandler(nimic);


        System.out.println( nrTelefon.metodaGestionareCerere(32498327,""));
        System.out.println(nrTelefon.metodaGestionareCerere(0,""));
        System.out.println(nrTelefon.metodaGestionareCerere(0,"ddd"));



        //System.out.println(nrTelefon);


        //B15 - Command
        Masa masa1 = new Masa(5);
        Masa masa2 = new Masa(10);

        B15_Command.Rezervare rezervare1 = new B15_Command.Rezervare(masa1);
        B15_Command.Rezervare rezervare2 = new B15_Command.Rezervare(masa2);


        Operator operator = new Operator();
        operator.adaugaComanda(rezervare1);
        operator.adaugaComanda(rezervare2);

        operator.executaComanda();
        operator.executaComanda();


        //B11 - Strategy
        IModPlata card = new PlataCard();
        IModPlata cash = new PlataCash();
        Client client = new Client();
        client.setiModPlata(cash);
        client.modDePlata();


        //B12 - Observer
        Restaurant restaurant = new Restaurant();
        ClientFidel clientFidel1 = new ClientFidel("Nicoleta");
        ClientFidel clientFidel2 = new ClientFidel("Razvan");
        ClientFidel clientFidel3 = new ClientFidel("Flavia");

        restaurant.abonareClientFidel(clientFidel1);
        restaurant.abonareClientFidel(clientFidel2);
        restaurant.abonareClientFidel(clientFidel3);

        restaurant.notificaIntroducereMeniuNou();
        restaurant.notificaOfertaPret();

        restaurant.notificaClientFidel("Altceva");
        restaurant.dezabonareClientFidel(clientFidel2);
        restaurant.notificaOfertaPret();

    }
}