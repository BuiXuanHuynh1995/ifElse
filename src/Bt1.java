import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("moi nhap so: ");
        int number = scanner.nextInt();
        if (number>5){
            System.out.println(number+" lon hon 5");
        }else if (number<5){
            System.out.println(number +" nho hon 5");
        }else {
            System.out.println(number+" bang 5");
        }
    }
}
