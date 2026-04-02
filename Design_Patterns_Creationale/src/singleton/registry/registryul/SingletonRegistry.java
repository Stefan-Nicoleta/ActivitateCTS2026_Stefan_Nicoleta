package singleton.registry.registryul;

import singleton.registry.clase.Personal;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private SingletonRegistry(){};

    //id ul trebuie sa fie unic
    //restul sunt datele angajatului
    private static Map<Integer, Personal> map = new HashMap<>();

    public static void setRegister(int id, Personal personal){
        if(map.containsKey(id)){
            System.out.println("Eroare");
        }
        map.put(id, personal);
    }

    public static Personal getPersonal(int id){
        Personal personal1 = map.get(id);
        if(personal1==null){
            System.out.println("eroare");
        }
        return personal1;
    }
}
