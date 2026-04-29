class xylem{
	public static void main(String[] args) {
		int num = 124734;
		System.out.print(isXylem(num));

	}
	public static boolean isXylem(int num){
		int exiSum = num%10;
		int midSum = 0;
		num/=10;

		while(num>9){
			midSum+=num%10;
			num/=10;
		}

		exiSum+=num;

		return exiSum==midSum;
	}
}