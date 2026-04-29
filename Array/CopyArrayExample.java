import java.util.Arrays;

public class CopyArrayExample {
    public static void main(String[] args) {
        int []arr1 ={10,54,24,12,44,55};
        int []arr2 = Arrays.copyOf(arr1,arr1.length );

        System.out.println("Orignal array");

        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println("Copy array");
        for(int i = 0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        arr2[2]=2;
        System.out.println("Modifid array 1");
        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println("Modified array 2 ");
        for(int i = 0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }



    }
    

}
