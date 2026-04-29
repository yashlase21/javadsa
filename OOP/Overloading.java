class Overloading{
	public static void main(String[] args) {
		add(100.0,14.0);
	}

	public static void add(int a, int b){
		System.out.println(a+b);
	}

	public static void add(char ch1, char ch2 ){
		System.out.println(ch1+ch2);
	}

	public static void add(String a, String b)
	{
		System.out.println(a+b);
	}

	public static void add(double d1, double d2)
	{
		System.out.println(d1+d2);
	}
}

// Method Overloading