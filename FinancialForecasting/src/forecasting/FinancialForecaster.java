package forecasting;

public class FinancialForecaster {

    // 1️⃣ Recursive Method
    public static double forecastRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecastRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    // 2️⃣ Iterative Method (more efficient)
    public static double forecastIterative(double initialValue, double growthRate, int years) {
        double result = initialValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }

    // 3️⃣ Formula-based Method (most efficient)
    public static double forecastFormula(double initialValue, double growthRate, int years) {
        return initialValue * Math.pow(1 + growthRate, years);
    }
}
