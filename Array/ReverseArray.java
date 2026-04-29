public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 47, 45, 58};

        System.out.println("Original Array:");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("  ");
        System.out.println("Reverse Aarray ");
        for(int i = arr.length-1; i>0;i--){
            System.out.println(arr[i] + " ");
        }
    }
}

