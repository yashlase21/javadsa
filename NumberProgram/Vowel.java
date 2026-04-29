import java.util.Scanner;

 class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine().toLowerCase();
        sc.close();

        System.out.print("Vowels: ");
        for (char ch : name.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                System.out.print(ch + " ");
            }
        }
    }
}
