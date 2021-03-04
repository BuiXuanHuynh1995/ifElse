import java.util.Scanner;

public class BtCheckNamNhuan {
    public static void check(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " la nam nhuan");
            } else {
                System.out.println(year + " khong la nam nhuan");
            }
        } else if (year % 4 == 0) {
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year + " khong la nam nhuan");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap nam: ");
        int year = scanner.nextInt();
        check(year);

    }
}
