class sum100digits{
	public static void main(String[] args) {
		System.out.print("Sum of 1 to 100 Digits :");
		int sum = 0;
		for (int i=1;i<=100 ;i++ ) {
			int num = i;
			
			while(num > 0)
			{

				int temp = num%10;
			sum = temp+sum;
			num = num/10;
			
			}
						System.out.println("Sum of 1 to 100 :  "+sum );
		}

	}
}