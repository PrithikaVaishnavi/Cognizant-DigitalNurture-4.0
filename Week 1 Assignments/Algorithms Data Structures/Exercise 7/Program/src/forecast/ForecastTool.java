package forecast;

public class ForecastTool 
{
    // Recursive method to calculate future value
    public static double futureValue(double currentValue, double growthRate, int years) 
    {
        if (years == 0) 
        {
            return currentValue;
        }
        return futureValue(currentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) 
    {
        double currentValue = 1000.0;      // Example - current investment
        double growthRate = 0.10;          // 10% annual growth
        int years = 5;                     // Forecast for 5 years

        double result = futureValue(currentValue, growthRate, years);
        System.out.printf("Predicted value after %d years: %.2f\n", years, result);
    }
}
