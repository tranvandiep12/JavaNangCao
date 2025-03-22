package KeThua;

import java.util.Scanner;

public class MainPhone {
    public static void main(String[] args) {
        System.out.print("-CHƯƠNG TRÌNH QUẢN LÍ ĐIỆN THOẠI- \n");
        System.out.println("1.Xem danh sách điện thoại");
        System.out.println("2.Thêm mới");
        System.out.println("3.Cập nhật");
        System.out.println("4.Xoá");
        System.out.println("5.Sắp xếp theo giá");
        System.out.println("6.Tìm kiếm");
        System.out.println("7.Tính tổng tiền");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập lựa chọn menu:  ");
        int nhap = Integer.parseInt(scanner.nextLine());

        switch (nhap){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                System.out.println("Vui lòng nhập lại!!");
                break;

        }
    }
}
