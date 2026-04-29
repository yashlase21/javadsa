import java.util.Scanner;
class printEvenOddwordsBasedOnUserChoice{
	public static void main(String[] args) {
		String str = "Yash Raj Veer Shubham Swayam Rahul Divya Durga ";

		Scanner sc = new Scanner(System.in);
		String str2 [] = str.split(" ");
		
		System.out.println("Enter the Choice Even/Odd ");
		String choice = sc.next().toLowerCase();
			for(String x :str2)
			{
				if ((choice.equals("even") && x.length() % 2 == 0) || 
                (choice.equals("odd") && x.length() % 2 != 0)) {
                System.out.println(x);
            }
		}
	}
}