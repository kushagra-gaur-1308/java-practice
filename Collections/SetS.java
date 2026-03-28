import java.util.*;

public class SetS {
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();

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