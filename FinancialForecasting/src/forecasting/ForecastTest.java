package forecasting;

public class ForecastTest {
    public static void main(String[] args) {

        double initialValue = 10000;  
        double growthRate = 0.05;     
        int years = 5;                

        // Recursive Forecast
        double futureRecursive = FinancialForecaster.forecastRecursive(initialValue, growthRate, years);
        System.out.printf("Recursive forecast after %d years: %.2f\n", years, futureRecursive);

        // Iterative Forecast
        double futureIterative = FinancialForecaster.forecastIterative(initialValue, growthRate, years);
        System.out.printf("Iterative forecast after %d years: %.2f\n", years, futureIterative);

        // Formula-based Forecast
        double futureFormula = FinancialForecaster.forecastFormula(initialValue, growthRate, years);
        System.out.printf("Formula-based forecast after %d years: %.2f\n", years, futureFormula);
    }
}
