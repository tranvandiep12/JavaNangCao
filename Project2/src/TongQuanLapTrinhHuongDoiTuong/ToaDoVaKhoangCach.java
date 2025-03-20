package TongQuanLapTrinhHuongDoiTuong;

public class ToaDoVaKhoangCach {
    public static void main(String[] args) {
        KhoangCach khoangCach1 = new KhoangCach();
        KhoangCach khoangCach2 = new KhoangCach();

        System.out.println("Nhập toạ độ điểm nhất ");
        khoangCach1.input();

        System.out.println("Nhập toạ độ điểm hai ");
        khoangCach2.input();

        double tinhKhoangCach = khoangCach1.tinhKhoangCach(khoangCach2);
        System.out.println("Khoảng cách giữa 2 điểm là: " + tinhKhoangCach);

    }
}
