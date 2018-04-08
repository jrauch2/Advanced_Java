package dip.lab2.student.solution1;

public enum ServiceQuality {
    GOOD(0.20),
    FAIR(0.15),
    POOR(0.10);

    private double value;

    private ServiceQuality(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
