import java.util.ArrayList;

public class TestScores {
    ArrayList<Decimal> testScores = new ArrayList<>();

    public TestScores(ArrayList testScores) {
        this.testScores = testScores;
    }

    public decimal testScoresAverage() {
        total = 0;
        for (decimal score: testScores) {
            total += score;
        }
        return total / testScores.size();
    }
}
