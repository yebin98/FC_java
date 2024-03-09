package fc.java.part6;

import fc.java.part6.model.AverageCalculator;

public class GenericLimitTest {
    public static void main(String[] args) {
        Integer[] integers = { 1, 2, 3, 4, 5 };
        Double[] doubles = { 1.0, 2.0, 3.0, 4.0, 5.0 };

        AverageCalculator<Integer> integerCalculator = new AverageCalculator<>(integers);
        double integerAverage = integerCalculator.calculateAverage();
        System.out.println("Integer average: " + integerAverage);

        AverageCalculator<Double> doubleCalculator = new AverageCalculator<>(doubles);
        double doubleAverage = doubleCalculator.calculateAverage();
        System.out.println("Double average: " + doubleAverage);
    }
}
