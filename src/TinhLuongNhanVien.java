import java.util.Scanner;

public class TinhLuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hệ_số_lương;
        int năm_làm_việc;
        double lương_tháng;


        System.out.print("Nhập vào hệ số lương: ");
        while (true) {
            hệ_số_lương = sc.nextDouble();
            if (1 <= hệ_số_lương && hệ_số_lương <= 5) {
                System.out.print("Nhập vào số năm làm việc:");
                năm_làm_việc = sc.nextInt();

                lương_tháng = hệ_số_lương * 4000000 + năm_làm_việc * 500000;
                System.out.println("Lương tháng là:" + lương_tháng);
            } else {
                System.out.println("Bạn nhập sai hệ số lương");
                System.out.println("Nhập lại hệ số lương");

            }
        }




    }
}
