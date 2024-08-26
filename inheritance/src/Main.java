//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setMake(null);
//        System.out.println(car.getMake());
        Bank account = new Bank();
        account.setName("Ahmed");
        account.setBalance(1000);
        account.deposit(100);
        account.withdraw(2000);
        System.out.println(account.getBalance());
    }
}