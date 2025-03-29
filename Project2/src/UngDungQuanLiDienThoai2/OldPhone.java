package UngDungQuanLiDienThoai2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OldPhone extends  Phone{
    private int tinhTrangPin;
    private String moTaThem;
    public OldPhone(){}

    public OldPhone(String id, String tenDienThoai, double giaBan, int thoiGianBaoHanh, String hanSanXuat, int tinhTrangPin, String moTaThem) {
        super(id, tenDienThoai, giaBan, thoiGianBaoHanh, hanSanXuat);
        this.tinhTrangPin = tinhTrangPin;
        this.moTaThem = moTaThem;
    }
    @Override
    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập trình trạng pin: ");
        this.tinhTrangPin = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mô tả điện thoại: ");
        this.moTaThem = scanner.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Tình trạng pin: " + this.tinhTrangPin);
        System.out.println("Mô tả điện thoại: " + this.moTaThem);
    }

    public int getTinhTrangPin() {
        return tinhTrangPin;
    }

    public void setTinhTrangPin(int tinhTrangPin) {
        this.tinhTrangPin = tinhTrangPin;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }
}
