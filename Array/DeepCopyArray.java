// Write a Java program to create a deep copy of an array manually.
public class DeepCopyArray  {
    public static void main(String[] args) {
        int []orignalarr={10,11,44,45,78,48};

        int []copyarray =  new int[orignalarr.length];

        for(int i = 0; i<orignalarr.length;i++){
            orignalarr[i]=copyarray[i];
        }
        
        //Modified array

        copyarray[2]=11;

        //Display Orgnal Array
        System.out.println("Display Orignal Array");
        
        for(int i = 0;i<orignalarr.length;i++){
            System.out.print(orignalarr[i]+ " ");
        }

        

    }
}
