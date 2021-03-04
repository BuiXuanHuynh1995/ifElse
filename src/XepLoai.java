import java.text.DecimalFormat;
import java.util.Scanner;

public class XepLoai {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem chuyen can:");
        float diemCHuyenCan = scanner.nextFloat();
        System.out.println("Nhap diem dieu kien: ");
        float diemDieuKien = scanner.nextFloat();
        System.out.println("Nhap diem thi:");
        float diemThi = scanner.nextFloat();

        float diemTB= (diemCHuyenCan+diemDieuKien+diemThi)/3;
        System.out.println(decimalFormat.format(diemTB));
        if (diemTB>=8.5){
            System.out.println("A");
        }else if (diemTB>=7){
            System.out.println("B");
        }else if (diemTB>=5.5){
            System.out.println("C");
        }else if (diemTB>=4){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
