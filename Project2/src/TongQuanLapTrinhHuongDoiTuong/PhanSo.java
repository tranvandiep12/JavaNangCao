package TongQuanLapTrinhHuongDoiTuong;

import java.util.Scanner;

/**
 * Xử Lí Phân Số
 */
public class PhanSo {
    int tuSo;
    int mauSo;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tử số: ");
        tuSo = Integer.parseInt(scanner.nextLine());


        do {
            System.out.print("Nhập vào mẫu số: ");
            mauSo = Integer.parseInt(scanner.nextLine());
            if (mauSo <= 0) {
                System.out.println("Mau so > 0 , Vui lòng nhập lại !");
            }

        } while (mauSo <= 0);
    }

    int uocChungLonNhat(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    void rutGon() {

        int ucln = uocChungLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;


        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }


    }

    void xuat() {
        rutGon();
        if (mauSo == 1) {
            System.out.println("Phân số sau khi rút gọn là: " + tuSo);

        } else {
            System.out.println("Phân số sau khi rút gọn là: " + tuSo + "/" + mauSo);
        }
    }

    PhanSo cong(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = tuSo * phanSoKhac.mauSo + phanSoKhac.tuSo * mauSo;
        ketQua.mauSo = mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    PhanSo tru(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = tuSo * phanSoKhac.mauSo - phanSoKhac.tuSo * mauSo;
        ketQua.mauSo = mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    PhanSo nhan(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = tuSo * phanSoKhac.tuSo;
        ketQua.mauSo = mauSo * phanSoKhac.mauSo;
        return ketQua;
    }

    PhanSo chia(PhanSo phanSoKhac) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = tuSo * phanSoKhac.mauSo;
        ketQua.mauSo = mauSo * phanSoKhac.tuSo;
        return ketQua;
    }

    boolean checkDuong() {
        return tuSo * mauSo > 0 || tuSo == 0;
    }

    boolean checkPhanSoKhong() {
        return tuSo == 0;
    }
}
