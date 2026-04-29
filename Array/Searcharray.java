public class Searcharray {
        public static void main(String[] args) {
            int [] arr = {10,45,12,45,25,30,180};

            int Searcharray = 10;
            boolean found = true;

            for(int i = 0; i<arr.length;i++){
                if (arr[i] == Searcharray) {
                    System.out.println("Array is found and Index Number : "+ i +" And founded array is :"+Searcharray);
                    break;
                }

                if (!found) {
                    System.out.println("Array is not found");
                    break;
                }
            }
        }
    
}