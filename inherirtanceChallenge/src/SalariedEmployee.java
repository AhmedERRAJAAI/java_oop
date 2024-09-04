public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String hireDate, double annualSalary, boolean isRetired) {
        super(hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void setEndData(String endDate){
        super.endDate = endDate;
    }

    public void retire() {
        isRetired = true;
    }


}
