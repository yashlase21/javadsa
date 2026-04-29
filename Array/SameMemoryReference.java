// Write a program showing that both references point to the same memory.
public class SameMemoryReference {
    public static void main(String[] args) {
        int []arr1 ={10,44,1,4,8,58};
        
        int []arr2 = arr1;

         System.out.println("arr1 memory reference: " + arr1);
        System.out.println("arr2 memory reference: " + arr2);

        // Compare references
        if (arr1 == arr2) {
            System.out.println("Both arr1 and arr2 point to the same memory location.");
        } else {
            System.out.println("They point to different memory locations.");
        }
    }

}