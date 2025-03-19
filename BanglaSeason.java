import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 3, 4:
                season = "Spring (Boshonto)";
                break;
            case 5, 6:
                season = "Summer (Grishmo)";
                break;
            case 7, 8:
                season = "Rainy (Borsha)";
                break;
            case 9, 10:
                season = "Autumn (Shorot)";
                break;
            case 11, 12:
                season = "Late Autumn (Hemonto)";
                break;
            case 1, 2:
                season = "Winter (Sheet)";
                break;
            default:
                season = "Invalid month";
        }

        System.out.println("Bangla season: " + season);
        scanner.close();
    }
}
