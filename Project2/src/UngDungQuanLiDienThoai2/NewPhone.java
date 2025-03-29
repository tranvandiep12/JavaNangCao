package UngDungQuanLiDienThoai2;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int soLuong;
    public NewPhone(){}

    public NewPhone(String id, String tenDienThoai, double giaBan, int thoiGianBaoHanh, String hanSanXuat, int soLuong) {
        super(id, tenDienThoai, giaBan, thoiGianBaoHanh, hanSanXuat);
        this.soLuong = soLuong;
    }

    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số lượng điện thoại: ");
        this.soLuong = Integer.parseInt(scanner.nextLine());
    }
    public void output(){
        super.output();
        System.out.println("Số lượng điện thoại: " + this.soLuong);
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
