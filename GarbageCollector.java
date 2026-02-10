public class GarbageCollector {
    public static void main(String[] args) {
        int a,b,c;
        b=10;
        c=20;
        System.out.println(b);
        System.out.println(c);
        System.gc();
    }
}