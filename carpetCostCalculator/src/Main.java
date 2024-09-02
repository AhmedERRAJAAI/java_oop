//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(10, 20);
        Carpet carpet = new Carpet(1.2);
        Calculator calc = new Calculator(floor, carpet);
        System.out.println(calc.getTotalCost());
    }
}