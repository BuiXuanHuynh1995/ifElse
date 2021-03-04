import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {
        int year = Year.now().getValue();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String ten =scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        int dob = scanner.nextInt();
        int soTuoi = year - dob;
        if (soTuoi>=18){
            System.out.println("Ban "+ ten+" da gia");
        }else if (soTuoi>=16){
            System.out.println("Ban "+ ten+" o tuoi truong thanh");
        }else {
            System.out.println("Ban "+ ten+" con tr");
        }

    }
}
