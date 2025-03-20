package Bai3;

import java.util.Scanner;

public class PhanSo {
    double tuSo;
    double mauSo;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        tuSo = Double.parseDouble(scanner.nextLine());

        do {
            System.out.print("Nhập mẫu số: ");
            mauSo = Double.parseDouble(scanner.nextLine());
            if (mauSo <= 0) {
                System.out.println("mau phai > 0, Vui lòng nhập lại!");
            }
        } while (mauSo == 0);
    }

    double uocChungLonNhat(double tuSobien, double mauSoBien) {
        if (tuSobien == 1 || mauSoBien == 1) {
            return 1;
        }
        tuSobien = Math.abs(tuSobien);
        for (double i = tuSobien; i > 1; i--) {
            if (tuSobien % i == 0 || mauSoBien % i == 0) {
                return i;
            }
        }
        return 0;
    }
    void rutGon(){
        double ucln = uocChungLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;

        if(mauSo < 0){
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }
    void xuat(){
        rutGon();
        if(mauSo == 1){
            System.out.println(tuSo);
        } else {
            System.out.println(tuSo + "/" + mauSo);
        }
    }
}





