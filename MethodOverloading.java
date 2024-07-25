import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Enter the today earning and expenses");
        Scanner scanner = new Scanner(System.in);
        int earning = scanner.nextInt();
        int expenses = scanner.nextInt();

        System.out.println("Get the amount in UPI");
        double earningUPI = scanner.nextDouble();
        double expensesUPI = scanner.nextDouble();

        int saving = todaySavings(earning,expenses);
        double savingUPI = todaySavingUPI(earningUPI,expensesUPI);
        System.out.println("Savings is :"+ saving);
        System.out.println("Savings in UPI :"+ savingUPI);

    }
    private static double todaySavingUPI(double earningUPI, double expensesUPI){
        return (earningUPI-expensesUPI);
    }
    private static int todaySavings(int earning, int expenses){
        return (earning - expenses);
    }
    
}
