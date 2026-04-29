class IncreasingOrderArray{
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6};
        int temp = 0;

        System.out.print("Orignal Array");
        for (int i = 0;i<arr.length ;i++ ) {
            System.out.print(arr[i]+" ");
        }

        System.out.print("Increasing Order Array");
        for (int i = 0;i<arr.length ;i++ ) {
            for (int j = i+1;j<arr.length ;j++ ) {
                if (arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;  
                }
            }
        }
        for (int i = 0;i<arr.length ;i++ ) {
            System.out.print(arr[i]+" ");
        }
    }
}
