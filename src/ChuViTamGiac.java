import java.util.Scanner;

public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh 1:");
        float canh1 = scanner.nextFloat();
        System.out.println("Nhap canh 2:");
        float canh2 = scanner.nextFloat();
        System.out.println("Nhap canh 3:");
        float canh3 = scanner.nextFloat();
        if (canh1+canh2>canh3 && canh1+canh3>canh2 && canh2+canh3>canh1){
            float chuVi = (canh1+canh2+canh3);
            System.out.println("Chu vi tam giac la: "+chuVi);
        }else {
            System.out.println(" khong phai 3 canh cua tam giac");
        }

    }
}
