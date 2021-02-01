package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;


    public Manager(String name, String nationalInsuranceNum, double salary, String deptName){
        super(name, nationalInsuranceNum, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
