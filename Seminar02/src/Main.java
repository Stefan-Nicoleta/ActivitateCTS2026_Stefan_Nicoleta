import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.loaders.AngajatiLoader;
import ro.ase.cts.loaders.AplicantiLoader;


public class Main {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        AplicantiLoader angLoader = new AngajatiLoader();
        System.out.println("*Seminar 2*");
        System.out.println();
        try {
            listaAngajati = angLoader.loadAplicanti("angajati.txt");
            for(Aplicant angajat:listaAngajati){
                System.out.println(angajat.toString());
                System.out.println();
                angajat.afisareFinantare(); //YAGNI
                System.out.println();
                angajat.afisareStatut();
                System.out.println();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("*Seminar 3*");
        System.out.println("Principii rezolvate: DRY, lowerCaseCamel, YAGNI & KISS, SOLID (tot in afara de I (ISP)");
    }

}