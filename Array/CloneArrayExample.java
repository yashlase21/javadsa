public class CloneArrayExample{
    public static void main(String[] args) {
        int []arr1 = {10,11,45,47,55};

        int []arr2= arr1.clone();
        System.out.println("array 1 ");
        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println("array 2");
        for(int i = 0; i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }
}