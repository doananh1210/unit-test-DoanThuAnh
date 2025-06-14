package src;

import java.util.List;

public class StudentAnalyzer {
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10) {
                if (score >= 8.0) {
                    count++;
                }
            }
            // bỏ qua điểm không hợp lệ
        }
        return count;
    }

    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        double sum = 0;
        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 0 && score <= 10) {
                sum += score;
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }
        return sum / count;
    }
}
