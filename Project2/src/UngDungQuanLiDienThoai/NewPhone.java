package UngDungQuanLiDienThoai;

import java.util.Scanner;

public class NewPhone extends Phone {

    private int quantity;

    public NewPhone() {
    }

    public NewPhone(String id, String name, double price, int warrnty, String manufacturer, int quantity) {
        super(id, name, price, warrnty, manufacturer);
        this.quantity = quantity;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong: ");
        this.quantity = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("So luong la: " + this.quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
