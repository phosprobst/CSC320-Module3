import java.util.Scanner;

public class TaxWithholding {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weeklyIncome;
        double taxRate;
        double taxWithholding;

        System.out.print("Enter weekly income: $");
        weeklyIncome = input.nextDouble();

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } 
        else if (weeklyIncome < 1500) {
            taxRate = 0.15;
        } 
        else if (weeklyIncome < 2500) {
            taxRate = 0.20;
        } 
        else {
            taxRate = 0.30;
        }

        taxWithholding = weeklyIncome * taxRate;

        System.out.printf("Weekly Income: $%.2f%n", weeklyIncome);
        System.out.printf("Tax Rate: %.0f%%%n", taxRate * 100);
        System.out.printf("Weekly Tax Withholding: $%.2f%n", taxWithholding);

        input.close();
    }
}