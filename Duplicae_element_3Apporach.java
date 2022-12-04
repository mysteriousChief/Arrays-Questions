import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicae_element_3Apporach {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 4, 3 };
        // Hash Map
       // hashmap(arr);
        hashset(arr);

    }

    public static void hashmap(int[] arr) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hp.containsKey(arr[i])) {
                hp.put(arr[i], hp.get(arr[i]) + 1);
            } else {
                hp.put(arr[i], 1);
            }
        }
        // printing keys
        for (Integer key : hp.keySet()) {
            System.out.println(key);
        }
        System.out.println();
        // printing values
        for (Integer value : hp.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, Integer> e : hp.entrySet()) {
            System.out.println(e + " ");
        }

    }

    public static void hashset(int[] arr) {
        Set<Integer> hp = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hp.add(arr[i]);
        }
        hp.forEach(ele -> System.out.println(ele + " "));

    }
}