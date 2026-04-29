class insertStringUsingSubstring{
	public static void main(String[] args) {
		String str = "Yash Lase";
		String insert = "Pandurang ";

		String result = str.substring(0,5)+insert+str.substring(5);
		System.out.print(result);
	}
}