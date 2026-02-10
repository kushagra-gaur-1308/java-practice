class Car{
    private int price=0;
    void setPrice(int x){
        this.price=x;
    }
    int getvalue(){
        return this.price;
    }
}

public class Private {
    public static void main(String[] args) {
        Car c= new Car();
        c.setPrice(10);
        int y=c.getvalue();
        System.out.println(y);
    }
    
}
