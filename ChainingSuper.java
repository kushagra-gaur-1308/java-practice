
    // Example of multiple super() calls in a constructor
    class A {
    A() {
        System.out.println("Constructor of A");
    }
}

class B extends A {
    B() {
        super();
        super();
        System.out.println("Constructor of B");
    }
}

public class ChainingSuper {
    public static void main(String[] args) {
        B obj = new B();
    }
}

// Another example of super with private

class A {
    private A() {
        System.out.println("Constructor of A");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Constructor of B");
    }
}

public class ChainingSuper {
    public static void main(String[] args) {
        B obj = new B();
    }
}
