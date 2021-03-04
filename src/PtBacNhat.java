import java.text.DecimalFormat;
import java.util.Scanner;

public class PtBacNhat {
    public static void main(String[] args) {
        DecimalFormat decimalFormat=new DecimalFormat("#.##");
        int a,b;
        double nghiem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a:");
        a = scanner.nextInt();
        System.out.println("nhap so b:");
        b=scanner.nextInt();
        if (a==0){
            if (b==0){
                System.out.println("pt vo so nghiem");
            }else {
                System.out.println("pt vo nghiem");
            }
        }else {
            nghiem = (double) -b/a;
            System.out.println("nghiem cua phuong trinh la: "+decimalFormat.format(nghiem));
        }
    }
}
