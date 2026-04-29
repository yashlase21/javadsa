import java.util.Scanner;
class  countNumberOFWordsInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Sentence :=== ");
        String str = sc.nextLine();
        int length = str.length();

        int count = 1;
       for (int i = 0; i < length- 1; i++) {
            if ((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
                count++;
                
            }
            
        }
        System.out.print("The Count Of the Words In the Sentence Is : "+ count);
    }
}


