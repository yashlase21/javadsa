import java.util.Arrays;

class medianElement {
    
    public static void medianElement(int[] arr, int n) {
        Arrays.sort(arr); 

        if (n % 2 != 0) {
            
            int median1 = arr[n / 2];
            System.out.println("Median: " + median1);
        } else {
            
            double median2 = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
            System.out.println("Median: " + median2);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7}; 
        int n = arr.length;

        
        medianElement(arr, n);
    }
}
