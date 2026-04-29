import java.util.Arrays;
class StringProgramToCheckAnagram{

	public static boolean isAnagram(String s1,String s2) {
		String str1 = s1.replaceAll("//s","").toLowerCase();
		String str2 = s2.replaceAll("//s","").toLowerCase();

		if (str1.length()!=str2.length()) {
			return false;	
		}

		else{
			char ch1 [] = str1.toCharArray();
			char ch2 [] = str2.toCharArray();


			Arrays.sort(ch1);
			Arrays.sort(ch2);

			return Arrays.equals(ch1,ch2);
		}
}
		 public static void main(String[] args) {
			System.out.print(isAnagram("Silent","listen"));
		}
		
	}

