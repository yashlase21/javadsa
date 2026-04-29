class MaxNumberInArray{
    public static void main(String[] args) {
        int arr[]={12,14,15,16,17};
        int max = 0;

        for (int i = 1;i<arr.length ;i++ ) {
             if (arr[i]>max) {
                 max=arr[i];
             }
            
        }
        System.out.print("Maximum Number From this Array"+max);
    }
}