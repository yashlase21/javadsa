import java.util.*;
class NameCharacters{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Name:");
		String name = sc.nextLine();

		
			System.out.print(" ");
		for (int i=0;i<name.length() ;i++ ) {
		
			System.out.println("Character at index " + i + " : " + name.charAt(i));
			
		}
	}

}