public class Account {
    private int accountNumber;
    private double balance;
    private String email;
    private String name;
    private String phoneNumber;

    public static int tester = 100;

    public Account(){ //this constructor will be called when no params ar passed
        this(1223, 13443.5, "email", "ahmed errajaai", "hello"); //must be in the same line
        System.out.println("Hello from constructor");
    }
//
    public Account(int accountNumber, double balance, String email, String name, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Balance is not enough");
        }
    }
}
