class Sample{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    String sum(String a,String b){
        return a+b;
    }
}
public class GenericImproved {
    public static void main(String[] args) {
        // For Integer
        Sample<Integer> intSample = new Sample<>();
        double x = intSample.sum(3, 4);
        System.out.println("Integer Sum: " + x);
        
        // For Float
        Sample<Float> floatSample = new Sample<>();
        double y = floatSample.sum(10.5f, 7.5f);
        System.out.println("Float Sum: " + y);

    }
}