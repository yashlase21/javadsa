class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryNumber = "10101";
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        System.out.println("Decimal equivalent of " + binaryNumber + " is: " + decimalNumber);
    }
}
