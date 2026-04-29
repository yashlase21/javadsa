
class SwapNumber
{
      public static void main (String [] Args);
	{
	int a = 21;
	int b = 38;
	System.out.Println("Before Swapping");
	System.out.Println("a : " +a);
	System.out.Println("b : "+b);
	
	int c = a;
	a = b;
	b = c;

	a = a+b;
	b = a-b;
	a = a-b;

	System.out.Println("After Swapping");
	System.out.Println("a :"+ a);
	System.out.Println("b :" +b);
	}
	

}