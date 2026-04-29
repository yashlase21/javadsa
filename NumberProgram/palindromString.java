import java.util.Scanner;
class palindromString {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter A String : ");
	String str = sc.nextLine();
	String rev = "";
	String dup = rev;

	for (int i=str.length()-1;i>0 ;i-- ) {
		rev+=str.charAt(i);

		
	}if (dup.equals(rev)) {
		System.out.print("This is Palindrom String");
	}else{
		System.out.print("This is Not Palindrom String");

	}
}