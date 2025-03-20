package Bai5;

public class ThoiGian {
    int gio ;
    int phut;
    int giay;
    public ThoiGian(){
        this.gio = 0;
        this.phut = 0;
        this.giay = 0;
    }
   void xuat(){
       System.out.println(this.gio + ":" + this.phut + ":" + this.giay);
   }
   public ThoiGian(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;

   }
}
