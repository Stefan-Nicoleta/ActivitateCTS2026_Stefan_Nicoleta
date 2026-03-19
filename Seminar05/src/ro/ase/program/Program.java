package ro.ase.program;

import ro.ase.builder01.spital.AbstractBuilder;
import ro.ase.builder01.spital.Internare;
import ro.ase.builder01.spital.InternareBuilder;
import ro.ase.builder02.spital.AbstractBuilder02;
import ro.ase.builder02.spital.InternareBuilder02;

public class Program {
    public static void main(String[] args) {
        Internare internare1 = new Internare();
        internare1.setNumePacient("Georgel Vasilescu");
        internare1.setPatRabatabil(true);

        Internare internare2 = new Internare();
        internare1.setNumePacient("Matcha");
        internare1.setHalat(true);

        AbstractBuilder builder = new InternareBuilder("Georgica");
        Internare internare3 = builder.setPatRabatabil(true).build();
        Internare internare4 = builder.setPapuci(true).setNume("Gigel").build();


        //internare3 si internare4 o sa ne afiseze acelasi lucru deoarece builder este suprascris!!!!!!
        System.out.println(internare3.toString()); //Internare{numePacient='Gigel', patRabatabil=true, micDejunInclus=false, papuciDeCamera=true, halat=false}
        System.out.println(internare4.toString()); //Internare{numePacient='Gigel', patRabatabil=true, micDejunInclus=false, papuciDeCamera=true, halat=false}
        System.out.println();

        AbstractBuilder02 builder02 = new InternareBuilder02();
        builder02.setMicDejun(true);

        ro.ase.builder02.spital.Internare internare5 = builder02.build("Georgica");
        ro.ase.builder02.spital.Internare internare6 = builder02.build("Gigi");

        //internare5 si internare6 afiseaza lucruri diferite! Aceasta varianta este cea buna!
        System.out.println(internare5.toString()); //Internare{numePacient='Georgica', patRabatabil=false, micDejunInclus=true, papuciDeCamera=false, halat=false}
        System.out.println(internare6.toString()); //Internare{numePacient='Gigi', patRabatabil=false, micDejunInclus=true, papuciDeCamera=false, halat=false}
        System.out.println();


        //testing
        internare5.setHalat(true);
        System.out.println(internare5.toString());
    }
}