import java.util.*;

public class Sortedset {
    public static void main(String[] args) {

        SortedSet<Integer> s = new TreeSet<>();

        // 🔹 Insertion
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(10); // duplicate (ignored)

        System.out.println("After Insertion: " + s);

        // 🔹 Deletion
        s.remove(20);

        System.out.println("After Deletion: " + s);

        // 🔹 Update (remove + add)
        s.remove(30);
        s.add(40);

        System.out.println("After Update: " + s);
    }
}