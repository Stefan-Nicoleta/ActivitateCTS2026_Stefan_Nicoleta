package ro.ase.cts.loaders;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiLoader extends AplicantiLoader {

    @Override
    public List<Aplicant> loadAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();
            super.loadAplicantData(input, student);
            int anStudii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setFacultate(facultate);
            student.setAnStudii(anStudii);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}