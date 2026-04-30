import java.util.Arrays;

public class CopyRangeExample {
    public static void main(String[] args) {
        int []arr1 = {10,12,14,17,78,45};
        int[]arr2 = Arrays.copyOfRange(arr1,2, 5);
        
        System.out.println("Orignal Array1");
        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println("Array 2 range copied");
        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
