import java.util.Scanner;
class Passfail
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Marks: ");
	int marks = sc.nextInt();
	int totalmarks = 500;
	float percentage = ((marks%500)*100);
	
	

	if(marks>35){
	System.out.println(" Fail");

}
	else if (marks>50){

	System.out.println("just Pass");

}
	else if(marks>60){
	System.out.println("Second Class");
	}

	else if(marks>75){
	System.out.println("First Class");
	}
	else if(marks>90){
	System.out.println("Fc with distinct");

	}
	else if(marks>100){
	System.out.println("Out of world");
	}
	





}



	
}