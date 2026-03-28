import java.util.*;

public class MapM {
    public static void main(String[] args) {

        // Creating Map
        Map<Integer, String> map = new HashMap<>();

        // 🔹 Insertion
        map.put(1, "Amit");
        map.put(2, "Rahul");
        map.put(3, "Rohit");

        System.out.println("After Insertion: " + map);

        // 🔹 Deletion
        map.remove(2);

        System.out.println("After Deletion: " + map);

        // 🔹 Update (replace value of existing key)
        map.put(3, "Karan");

        System.out.println("After Update: " + map);
    }
}