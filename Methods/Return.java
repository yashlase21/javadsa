class Return{
	public static void main(String[] args) {
		System.out.println(mergString("Yash","lase"));
		System.out.println(addTwoNum(1,5));
	}

	public static String mergString(String firstName,String lastName){
		String ans = firstName+" "+lastName;
		return ans;
	}
	public static int addTwoNum(int a,int b){
		int ans1 = a+b;
		return ans1;
	}
}

