package lab4;

public class Company {
    private HumanResourcesDepartment humanResourcesDepartment;
    //This is a company.
    public Company() {
        humanResourcesDepartment = new HumanResourcesDepartment();
    }
    //Every company has a Human Resources Department in charge of employees.
    public void hireEmployee(String firstName, String lastName, String ssn, String cubeId) {
        humanResourcesDepartment.hireEmployee(firstName, lastName, ssn, cubeId);
    }

    public void hireEmployee(Employee employee, String cubeId) {
        humanResourcesDepartment.hireEmployee(employee, cubeId);
        humanResourcesDepartment.outputReport(employee);
    }

    public HumanResourcesDepartment getHumanResourcesDepartment() {
        return humanResourcesDepartment;
    }
}
