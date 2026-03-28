import java.util.*;

public class Sortedmap {
    public static void main(String[] args) {

        // Creating SortedMap
        SortedMap<Integer, String> sm = new TreeMap<>();

        // 🔹 Insertion
        sm.put(3, "C");
        sm.put(1, "A");
        sm.put(2, "B");

        System.out.println("After Insertion: " + sm);

        // 🔹 Deletion
        sm.remove(2);

        System.out.println("After Deletion: " + sm);

        // 🔹 Update (replace value of existing key)
        sm.put(1, "Z");

        System.out.println("After Update: " + sm);
    }
}