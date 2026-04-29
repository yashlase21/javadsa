// Create one array and assign it to another reference variable. Modify one array and observe changes

public class ArrayReferenceExample {
    public static void main(String[] args) {
        int [] arr1 ={10,20,30,45,46,74};
        int []arr2 = arr1;

        arr2[5] = 55;
        System.out.println("Array One Element ");
        for(int i =0; i<arr1.length;i++){
            System.out.println(arr1[i]+ " ");
        }
        System.out.println("Array Two Element");
        for(int i =0; i<arr2.length;i++){
            System.out.println( arr2[i] + " ");
        }

    }
    
}
