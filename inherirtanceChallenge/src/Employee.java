public class Employee extends Worker {
    private long employedId;
    private String hireDate;

    private static long employeeNo = 1;

    public Employee() {
    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate, "Unkown");
        this.employedId = employeeNo++;
        this.hireDate = hireDate;
    }
}
