class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12, 5, 20, 3, 18, 7}; // Given array

        
        int smallest = arr[0];

        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i]; 
            }
        }

        
        System.out.println("Smallest number in the array: " + smallest);
    }
}
