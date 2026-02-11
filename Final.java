class A{
    final int a=10;
}

class B extends A{
    public void display(){
        System.out.println(a);
    }
}


// the final keywords is accesed in the main class but from the above shown it is not accesing using simple inherit.
public class Final{
    public static void main(String[] args) {
        A obj= new A();
        System.out.println(obj.a);
    }
}
