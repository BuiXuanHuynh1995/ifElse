import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        float javaCore;
        float javaWeb;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap diem java core:");
        javaCore = scanner.nextFloat();
        System.out.println("nhap diem java web:");
        javaWeb= scanner.nextFloat();
        if (javaCore>javaWeb){
            System.out.println("Diem java core lon hon java web");
        }else if (javaCore<javaWeb){
            System.out.println("Diem java core nho hon java web");
        }else {
            System.out.println("Diem java core bang java web");
        }
    }
}
