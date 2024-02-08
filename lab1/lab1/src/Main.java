import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Введення початкових значень
        double a = getInput("Введіть значення для a: ");
        double b = getInput("Введіть значення для b: ");
        double x = getInput("Введіть значення для x: ");

        double y;
        double z;

        // Обчислення для y
        y = Math.pow(Math.sin(Math.pow((x * x + a), 2)), 3) - Math.sqrt(x / b);

        // Виведення значень вхідних даних та результату для y
        System.out.println("\nОбчислення для Y:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("Y = " + y);

        // Обчислення для z
        z = (x * x) / a + Math.cos(Math.pow((x + b), 3));

        // Виведення значень вхідних даних та результату для z
        System.out.println("\nОбчислення для Z:");
        System.out.println("Z = " + z);

        // Виведення поточної дати і часу
        printCurrentDateTime();
    }

    // Метод для введення значень з клавіатури
    private static double getInput(String message) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Метод для виведення поточної дати і часу
    private static void printCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM");
        Date currentDate = new Date();
        System.out.println("\nПоточна дата і час: " + dateFormat.format(currentDate));
    }
}
