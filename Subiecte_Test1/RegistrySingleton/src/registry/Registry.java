package registry;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Registry(){}
        static Map<String, Turism> map = new HashMap<>();

        public static void register(String nume, Turism turism) throws Exception {
            if (map.containsKey(nume))
                throw new Exception("Key" + nume);
            else map.put(nume, turism);
        }
        public static Turism getPachet(String nume){
            return map.get(nume);
            }
}
