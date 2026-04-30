// Write a Java program to demonstrate shallow copy of an array.

public class ShallowCopyArray {
    public static void main(String[] args) {

        // Original array
        int[] originalArray = {10, 20, 30, 40, 50};

        // Shallow copy (same reference)
        int[] copiedArray = originalArray;

        // Modify copied array
        copiedArray[2] = 99;

        // Display original array
        System.out.println("Original Array:");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }

        System.out.println();

        // Display copied array
        System.out.println("Copied Array:");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
    }
}