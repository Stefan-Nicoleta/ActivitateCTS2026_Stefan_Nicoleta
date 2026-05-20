package main;

import B10_Flyweight.Client;
import B10_Flyweight.FlyweightFactory;
import B10_Flyweight.Rezervari;
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
    }
}