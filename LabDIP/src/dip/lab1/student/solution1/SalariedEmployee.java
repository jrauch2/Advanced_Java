package dip.lab1.student.solution1;

/**
 *
 * @author jrauch2
 */
public class SalariedEmployee implements Employee {

    private double annualSalary;
    private double annualBonus;

    /**
     *
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    @Override
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
}
