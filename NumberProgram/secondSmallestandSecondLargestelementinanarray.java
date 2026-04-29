import java.util.Arrays;
class secondSmallestandSecondLargestelementinanarray{

    public static void getElement(int arr[],int n){
        if (n<2) {
            System.out.print("Invalid Input");
            return; 
        }
        Arrays.sort(arr);

        int secondSmallest = arr[1];
        int secondLargest = arr[n-2];
        System.out.println("The Second Smallest Element Is  "+secondSmallest);
        System.out.println("The Second Largest Element IS  "+secondLargest);
    }
    public static void main(String[] args) {
        int arr [] = {1,55,44,21,11,8};
        int n = arr.length;
        getElement(arr,n);

    }
}

