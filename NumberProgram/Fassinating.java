class Fascinating {
    public static void main(String[] args) {
        int num = 327;
        // Concatenate num, num*2, and num*3 into a string.
        String str = num + "" + (num * 2) + (num * 3);
        boolean flag = true;
        
        // Check if every digit from '1' to '9' appears exactly once in the concatenated string.
        for (char i = '1'; i <= '9'; i++) {
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);  // Use j as the index to iterate over the string
                if (ch == i) {
                    cnt++;  // Increase the count if the current digit matches
                }
            }
            if (cnt != 1) {
                flag = false;
                break;
            }
        }
        
        // Output the result.
        if (flag) {
            System.out.println(num + " is a fascinating number.");
        } else {
            System.out.println(num + " is NOT a fascinating number.");
        }
    }
}
