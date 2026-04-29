class OddEvenSum{
	public static void main(String[] args) {
		int num = 2233;

		int even = 0;
		int odd = 0;
		while(num>0){
			int digit = num%10;
			if(digit%2==0){
				even+=digit;
			}else{
				odd+=digit;
			}
			num/=10;
		}
		System.out.println("Sum of Even Number : "+even);
			System.out.println("Sum of odd Numbers :"+odd);
	}
}
