import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        LocalDate date = dateParser(birthDate);
        int age = LocalDate.now().getYear() - date.getYear();
        return age;
    }

    public double collectPay() {
        return 0;
    }

    void terminate(String endDate) {

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    private LocalDate dateParser(String date) {
        try {
            return LocalDate.parse(date);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return LocalDate.now();
        }
    }
}
