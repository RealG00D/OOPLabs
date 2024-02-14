import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class Calculator {
    private double a;
    private double b;
    private double x;

    public Calculator(double a, double b, double x) {
        this.a = a;
        this.b = b;
        this.x = x;
    }

    public double calculateY() {
        return Math.pow(Math.sin(Math.pow((x * x + a), 2)), 3) - Math.sqrt(x / b);
    }

    public double calculateZ() {
        return (x * x) / a + Math.cos(Math.pow((x + b), 3));
    }

    public void printResults() {
        System.out.println("\nОбчислення для Y:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("Y = " + calculateY());

        System.out.println("\nОбчислення для Z:");
        System.out.println("Z = " + calculateZ());
    }
}

public class Main {
    public static void main(String[] args) {
        double a = getInput("Введіть значення для a: ");
        double b = getInput("Введіть значення для b: ");
        double x = getInput("Введіть значення для x: ");

        Calculator calculator = new Calculator(a, b, x);
        calculator.printResults();

        printCurrentDateTime();
    }

    private static double getInput(String message) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print(message);
        return scanner.nextDouble();
    }

    private static void printCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM");
        Date currentDate = new Date();
        System.out.println("\nПоточна дата і час: " + dateFormat.format(currentDate));
    }
}
