import java.util.*;

class LaxmiChitFund {
    static String username;
    static String phone;
    static String pin;
    static long adhar;
    static String pan;
    static double bal;
    static final String ifsc = "ABC123456";
    static final long accountNO = 12345678911L;
    static ArrayList<String> tran = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int attempt = 3;

    public static void main(String[] args) {
        for (;;) {
            System.out.println();
            System.out.println("               WELCOME     ");
            System.out.println("             ** LAXMI CHIT FUND **");
            System.out.println();
            System.out.println("1. Existing User");
            System.out.println("2. Create Account");
            System.out.print("Enter an Option: ");
            int opt = sc.nextInt();
            System.out.println();
            switch (opt) {
                case 1 -> login();
                case 2 -> createAccount();
                default -> System.out.println("INVALID OPTION");
            }
        }
    }

    public static void login() {
        if (username != null) {
            System.out.println("      *** LOGIN ***    ");
            System.out.println();
            sc.nextLine(); // Consume newline
            System.out.print("Username/Phone: ");
            String cred1 = sc.nextLine();
            System.out.print("Password: ");
            String cred2 = sc.next();
            if ((cred1.equals(username) || cred1.equals(phone)) && cred2.equals(pin)) {
                homePage();
            } else {
                attempt--;
                System.out.println();
                System.out.println("WRONG CREDENTIALS ENTERED");
                System.out.println("Attempts left: " + attempt);
                if (attempt == 0) {
                    System.exit(0);
                }
                login();
            }
        } else {
            System.out.println("CREATE YOUR ACCOUNT FIRST");
        }
    }

    public static void createAccount() {
        System.out.println("          *** ACCOUNT CREATION ***         ");
        System.out.println();
        System.out.print("Username: ");
        sc.nextLine(); // Consume newline
        username = sc.nextLine();
        System.out.print("Phone number: ");
        phone = sc.next();
        System.out.print("PIN: ");
        pin = sc.next();
        System.out.print("Aadhar Number: ");
        adhar = sc.nextLong();
        System.out.print("PAN Number: ");
        pan = sc.next();
        System.out.print("Amount to be deposited: ");
        bal = sc.nextDouble();
        tran.add("Deposit: " + bal + "rs");
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
        login();
    }

    public static void homePage() {
        for (;;) {
            System.out.println();
            System.out.println("** HOME PAGE **");
            System.out.println();
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Statement");
            System.out.println("5. Edit User");
            System.out.println("6. Loan");
            System.out.println("7. Logout");
            System.out.print("Enter an option: ");
            int opt = sc.nextInt();
            System.out.println();
            switch (opt) {
                case 1 -> depositAmount();
                case 2 -> withdrawAmount();
                case 3 -> checkBalance();
                case 4 -> statements();
                case 5 -> editUser();
                case 6 -> loan();
                case 7 -> {
                    System.out.println("Thank You! VISIT AGAIN");
                    System.exit(0);
                }
                default -> System.out.println("WRONG OPTION");
            }
        }
    }

    public static void depositAmount() {
        System.out.println(" *** DEPOSIT AMOUNT *** ");
        System.out.print("Enter the amount: ");
        double depositAmt = sc.nextDouble();
        tran.add("Deposit: " + depositAmt + "rs");
        bal += depositAmt;
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
    }

    public static void withdrawAmount() {
        System.out.println(" *** WITHDRAW AMOUNT ***");
        System.out.print("Amount: ");
        double withAmt = sc.nextDouble();
        System.out.print("PIN: ");
        String userPin = sc.next();
        if (userPin.equals(pin)) {
            if (withAmt <= bal) {
                bal -= withAmt;
                tran.add("Withdraw: " + withAmt + "rs");
                System.out.println("Amount Debited Successfully");
            } else {
                System.out.println("INSUFFICIENT FUNDS");
            }
        } else {
            System.out.println("INCORRECT PIN");
        }
    }

    public static void checkBalance() {
        System.out.println(" *** CHECK BALANCE ***");
        System.out.print("PIN: ");
        String userPin = sc.next();
        if (userPin.equals(pin)) {
            System.out.println(username + ", your account balance is: " + bal + "rs");
        } else {
            System.out.println("INCORRECT PIN");
        }
    }

    public static void statements() {
        System.out.println(" *** STATEMENTS ***");
        for (String i : tran) {
            System.out.println(i);
        }
    }

    public static void editUser() {
        System.out.println("1. Edit Username\n2. Edit Phone\n3. Edit PIN");
        switch (sc.nextInt()) {
            case 1 -> {
                System.out.print("New Username: ");
                username = sc.next();
            }
            case 2 -> {
                System.out.print("New Phone: ");
                phone = sc.next();
            }
            case 3 -> {
                System.out.print("Current PIN: ");
                if (sc.next().equals(pin)) {
                    System.out.print("New PIN: ");
                    pin = sc.next();
                } else {
                    System.out.println("Incorrect PIN.");
                }
            }
            default -> System.out.println("Invalid option.");
        }
    }

    public static void loan() {
        System.out.println(" *** LOAN ***");
        System.out.println("Feature coming soon.");
    }
}
