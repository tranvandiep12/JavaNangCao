package TongQuanLapTrinhHuongDoiTuong;

public class XuLiPhanSo {
    public static void main(String[] args) {
        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();

        System.out.println("Nhập phân số nhất: ");
        phanSo1.input();

        System.out.println("Nhập phân số hai: ");
        phanSo2.input();

        System.out.print("Phân số thứ nhất: ");
        phanSo1.xuat();

        System.out.print("Phân số thứ hai: ");
        phanSo2.xuat();

        System.out.print("Tổng 2 phân số: ");
        PhanSo tong = phanSo1.cong(phanSo2);
        tong.xuat();

        System.out.print("Hiệu 2 phân số: ");
        PhanSo hieu = phanSo1.tru(phanSo2);
        hieu.xuat();

        System.out.print("Tích 2 phân số: ");
        PhanSo tich = phanSo1.nhan(phanSo2);
        tich.xuat();

        System.out.print("Thương 2 phân số: ");
        PhanSo thuong = phanSo1.chia(phanSo2);
        thuong.xuat();


    }
}
