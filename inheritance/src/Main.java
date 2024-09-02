//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Account account = new Account();
        System.out.println(Account.tester);
//        Account account = new Account(123, 123.12, "ahmed@gmail.com", "ahmed", "06245455454");
//        System.out.println(account.getName());
//        System.out.println(account.getBalance());
        for (int i = 0; i <= 5 ; i++) {
            Pojo pj = new Pojo("ahmed", String.valueOf(i), "10/9/1998", "class");
            System.out.println(pj); //calls the toString() method implicitly
        }
    }
}