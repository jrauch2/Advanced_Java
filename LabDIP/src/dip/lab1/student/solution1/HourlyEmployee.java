package dip.lab1.student.solution1;

/**
 *
 * @author jrauch2
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private double totalHrsForYear;

    /**
     *
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    /**
     *
     * @return annual wages for hourly workers using the formula
     * annualWages = hourlyRate * totalHrsForYear
     */
    public double getAnnualWages() {
        return hourlyRate * totalHrsForYear;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     *
     * @param hourlyRate
     */
    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    /**
     *
     * @return
     */
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    /**
     *
     * @param totalHrsForYear
     */
    public void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
        }

    }



