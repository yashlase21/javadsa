class Sumarray {
	public static void main(String[] args) {
		int [] arr ={10,14,41,10,41,100};

		int sum = arr[0];

		for (int i = 0;i<arr.length;i++ ) {
			sum = sum + arr[i];
		}

		System.out.print(sum);
	}
}