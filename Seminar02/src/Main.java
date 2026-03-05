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
        try {
            listaAngajati = angLoader.loadAplicanti("angajati.txt");
            for(Aplicant angajat:listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}