package ConstructorAccessModifier;

public class MainThoiGian {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.xuat();
        ThoiGian b = new ThoiGian(7);
        b.xuat();
        ThoiGian c = new ThoiGian(7, 30);
        c.xuat();
        ThoiGian d = new ThoiGian(7, 30, 50);
        d.xuat();

    }
}
