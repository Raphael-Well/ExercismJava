public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped >= 5 ? .85 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return multiplierPerProductsSold(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000.0 * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        return salary > 2000 ? 2000.0 : salary;
    }
}
