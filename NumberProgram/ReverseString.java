class ReverseString{
    public static void main(String[] args) {
        String str = "JDDKJFJdjf";
        String rev = "";

        int len = str.length();

        for (int i = len-1;i>=0 ;i-- ) {
            rev+=str.charAt(i);
            
        }
        System.out.print("The Reverse String Is "+rev);
    }
}