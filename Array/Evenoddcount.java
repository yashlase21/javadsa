class Evenoddcount{
	public static void main(String[] args) {
		int arr [] = {10,14,47,44,411,145,454};

		int evenCount = 0;
		int oddCount = 0;

		for (int i =0;i<arr.length;i++ ) {
			if (arr[i]%2==0) {
				evenCount++;
			}else{
				oddCount++;
			}
		}

		System.out.println(evenCount);
		System.out.println(oddCount);
	}
}