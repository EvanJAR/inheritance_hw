package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNum;
    private double salary;

    public Employee(String name, String nationalInsuranceNum, double salary){
        this.name = name;
        this.nationalInsuranceNum = nationalInsuranceNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalInsuranceNum() {
        return nationalInsuranceNum;
    }

    public void setNationalInsuranceNum(String nationalInsuranceNum) {
        this.nationalInsuranceNum = nationalInsuranceNum;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double salary) {
        this.salary = salary;
    }

    public double payBonus(){
        return salary / 100;
    }


}
