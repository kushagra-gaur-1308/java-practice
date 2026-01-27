public class DuplicateNumber{
    static int[] arr = {1, 2, 3, 4, 2};
    public static void main(String[]args){

        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                }
            }
        }

        if (duplicate)
            System.out.println("Duplicate exists");
        else
            System.out.println("No duplicate");
    }


}