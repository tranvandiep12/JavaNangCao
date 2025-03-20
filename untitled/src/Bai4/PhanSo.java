package Bai4;

public class PhanSo {
    double tuSo;
    double mauSo;

    PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    PhanSo(double tuSo, double mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    void xuat() {
        System.out.println(this.tuSo / this.mauSo);
    }


}
