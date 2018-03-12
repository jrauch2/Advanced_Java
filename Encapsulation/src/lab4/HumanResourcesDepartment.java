package lab4;

import java.util.ArrayList;
import java.util.List;

public class HumanResourcesDepartment {
    String MSG = "Employee not found.";
    List<Employee> employeeList;

    public HumanResourcesDepartment() {
        employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void hireEmployee(String firstName, String lastName, String ssn, String cubeId){
        Employee employee = new Employee(firstName, lastName, ssn);
        employeeList.add(employee);
        orientation(employee, cubeId);
    }

    public void hireEmployee(Employee employee, String cubeId) {
        employeeList.add(employee);
        orientation(employee, cubeId);
    }

    public void orientation(Employee employee, String cubeId) {
        employee.doFirstTimeOrientation(cubeId);
    }

    public void outputReport(Employee employee) {
        Employee foundEmployee = null;
        for (Employee e: employeeList) {
            if (employee.equals(e)) {
                foundEmployee = employee;
            }
        }
        if (foundEmployee != null) {
            foundEmployee.getReportService().outputReport();
        } else {
            throw new IllegalArgumentException(MSG);
        }
    }

    public Employee getEmployee(String ssn){
        Employee employee = null;
        for (Employee e: employeeList) {
            if(ssn.equals(e.getSsn())) {
                employee = e;
            }
        }
        if (employee != null) {
            return employee;
        } else {
            throw new IllegalArgumentException(MSG);
        }
    }
}
