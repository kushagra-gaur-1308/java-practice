import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        int sum,sum_array=0;
        Scanner s=new Scanner(System.in);
        sum=s.nextInt();
        // new keyword \is used to make object array type
        int arr[]=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=s.nextInt();
            sum_array+=arr[i];
        }
        if(sum==sum_array){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
