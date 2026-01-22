import java.util.*;
public class Car{
    int ymodel_year;
    int mileage;
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year of car1:");
        c1.ymodel_year=s.nextInt();
        System.out.println("The year of car1 is :" + c1.ymodel_year);
        System.out.println("Enter the mileage of car1:");
        c1.mileage=s.nextInt();
        System.out.println("The mileage of car1 is :" + c1.mileage);

    }
    s.close();
}