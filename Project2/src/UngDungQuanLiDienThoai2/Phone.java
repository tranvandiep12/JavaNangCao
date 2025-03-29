package UngDungQuanLiDienThoai2;

import java.util.Scanner;

public class Phone {
    private String id;
    private String tenDienThoai;
    private double giaBan;
    private int thoiGianBaoHanh;
    private String hanSanXuat;
    public Phone(){}
    public Phone(String id, String tenDienThoai, double giaBan, int thoiGianBaoHanh, String hanSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.hanSanXuat = hanSanXuat;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên điện thoại: ");
        this.tenDienThoai = scanner.nextLine();
        System.out.print("Nhập giá bán điên thoại: ");
        this.giaBan = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập thời gian bảo hành: ");
        this.thoiGianBaoHanh = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập hãn sãn xuất điện thoại: ");
        this.hanSanXuat = scanner.nextLine();
    }
    public void output(){
        System.out.println("ID: " + this.id);
        System.out.println("Tên điện thoại: " + this.tenDienThoai);
        System.out.println("Giá bán: " + this.giaBan);
        System.out.println("Thời gian bảo hành: " + this.thoiGianBaoHanh);
        System.out.println("Hãn sản xuất điện thoại: " + this.hanSanXuat);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getHanSanXuat() {
        return hanSanXuat;
    }

    public void setHanSanXuat(String hanSanXuat) {
        this.hanSanXuat = hanSanXuat;
    }
}
