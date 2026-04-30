public class MergeArraysExample {
    public static void main(String[] args) {
        int[] arr1 = {10,11,12,13,45};
        int [] arr2 = {10,22,22,25,45};

        int [] MergeArray = new int[arr1.length+arr2.length];

        // copying fist array element

        for(int i = 0; i<arr1.length;i++){
            MergeArray[i]=arr1[i];
        }

        // copying second array element
        for(int i = 0; i<arr2.length;i++){
            MergeArray[arr1.length+i]=arr2[i];
        }

        System.out.print("Merge Array is : ");
        for(int i = 0;i<MergeArray.length;i++){
            System.out.print(MergeArray[i] + " ");
        }

    }
}
