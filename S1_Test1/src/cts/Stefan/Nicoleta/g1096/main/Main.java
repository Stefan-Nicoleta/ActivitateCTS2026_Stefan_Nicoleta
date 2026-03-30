package cts.Stefan.Nicoleta.g1096.main;

import cts.Stefan.Nicoleta.g1096.builder.AbstractBuilder;
import cts.Stefan.Nicoleta.g1096.builder.Magazin;
import cts.Stefan.Nicoleta.g1096.builder.MagazinBuilder;
import cts.Stefan.Nicoleta.g1096.builder.TipDecoratiuni;

public class Main {
    public static void main(String[] args) {
        //recomandat sa punem block try catch pt a respecta KISS
        try{
            AbstractBuilder builder = new MagazinBuilder();
            AbstractBuilder builder2 = new MagazinBuilder();
            AbstractBuilder builder3 = new MagazinBuilder();

            Magazin magazin1 = builder.setDuritatePodeaSpeciala(4).setDenumire("Kaufland").setTipDecoratiuni(TipDecoratiuni.STICLA).build();
            Magazin magazin2 = builder2.setDenumire("MegaImage").setTipDecoratiuni(TipDecoratiuni.LEMN).build();
            Magazin magazin3 = builder3.setDenumire("ALALALAAL").setSuprafata(100).setTipDecoratiuni(TipDecoratiuni.LEMN).build();




            System.out.println(magazin1.toString());
            System.out.println(magazin2.toString());
            System.out.println(magazin3.toString());
            System.out.println();

        } catch (Exception e) {
            System.err.println("Eorare la crearea magazinului!");
        }


    }
}