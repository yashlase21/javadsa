class factorial{
	public static void main(String[] args) {
		int num = 45;
		int dup = num;
		int sum = 0;


		while(num>0){
			int rem = num%10;
			int fact =1;
			for (int i = rem;i>=1; i-- ) {
				sum +=fact;
				if(rem%2!=0);{
System.out.println(dup);
			System.out.println("The sum of the factorial digits"+sum);

				}	
				
			}
			
		
		num/=10;
		}
	}
}