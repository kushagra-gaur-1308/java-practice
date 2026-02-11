// Debugging the code:

Class A {
    private int a;
    void setval(float a){
        a=x;
    }

}
public class Debug{
    public static void main(Integer args[]) {
        
        A a1= new A();
        a1.setval(3.0);
        System.out.println(a1.a);
    }
}

// total three error in the code:
// 1.giving the float value in the int which is not possible as int is small size of float. (in class A)
// 2.Integer in the main method instaed of String[]
// 3.Trying to access the private var in other class not possible.