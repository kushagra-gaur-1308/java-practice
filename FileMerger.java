import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerger {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("Sample.txt");
            int i;

            System.out.println("Content of Sample.txt BEFORE adding:\n");

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading Sample.txt: " + e.getMessage());
        }

        try {
            FileWriter fw = new FileWriter("Sample.txt", true); // append mode
            fw.write("\nThis line is newly added to Sample.txt.");
            fw.close();

            System.out.println("\n\nData added to Sample.txt successfully.");
        } catch (IOException e) {
            System.out.println("Error writing Sample.txt: " + e.getMessage());
        }

        try {
            FileReader fr1 = new FileReader("Sample.txt");
            FileReader fr2 = new FileReader("Second.txt");
            FileWriter fw = new FileWriter("Merged.txt");

            int i;

            while ((i = fr1.read()) != -1) {
                fw.write(i);
            }

            fw.write("\n"); // separator

            while ((i = fr2.read()) != -1) {
                fw.write(i);
            }

            fr1.close();
            fr2.close();
            fw.close();

            System.out.println("\nFiles merged successfully.");

        } catch (IOException e) {
            System.out.println("Error merging files: " + e.getMessage());
        }

        try {
            FileReader fr = new FileReader("Merged.txt");
            int i;

            System.out.println("\n\nFinal Merged File Content:\n");

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error reading Merged.txt: " + e.getMessage());
        }
    }
}
