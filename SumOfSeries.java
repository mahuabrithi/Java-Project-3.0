import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1, count = 0; count < n; i += 2, count++) {
            sum += (i * i);
        }

        System.out.println("Sum of the series: " + sum);
        scanner.close();
    }
}
