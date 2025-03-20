package TongQuanLapTrinhHuongDoiTuong;

import java.util.Scanner;

/**
 * Xử Lí Toạ Độ Và khoảng Cách Giữa 2 Điểm
 */
public class KhoangCach {
    double x , y;
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập x: ");
        x = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập y: ");
        y = Double.parseDouble(scanner.nextLine());
    }
    double tinhKhoangCach(KhoangCach other){
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
}
