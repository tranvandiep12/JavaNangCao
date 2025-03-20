package TongQuanLapTrinhHuongDoiTuong;

import java.util.Scanner;
/**
 * Quản Lí Thông Tin Học Sinh
 */
public class Student {
    String name;
    double mathScore;
    double literatureScore;

     void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();

         System.out.print("Điểm toán: ");
         mathScore = Double.parseDouble(scanner.nextLine());

         System.out.print("Điểm văn: ");
         literatureScore = Double.parseDouble(scanner.nextLine());
    }
    double calaverageScore(){
         return (mathScore + literatureScore) / 2;
    }
    void averageScore(){
        System.out.println("Điểm trung bình: " + calaverageScore());
    }
}
