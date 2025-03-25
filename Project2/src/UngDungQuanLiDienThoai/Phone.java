package UngDungQuanLiDienThoai;

import java.util.Scanner;

public class Phone {

    private String id;
    private String name;
    private double price;
    private int warranty;
    private String manufacturer;

    public Phone() {
    }

    public Phone(String id, String name, double price, int warrnty, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warrnty;
        this.manufacturer = manufacturer;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tên điện thoại:  ");
        this.name = scanner.nextLine();
        System.out.print("Nhap gia ban: ");
        this.price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap time bao hanh: ");
        this.warranty = Integer.parseInt(scanner.nextLine());
        System.out.print("Hang san xuat: ");
        this.manufacturer = scanner.nextLine();
    }

    public void output() {
        System.out.println("Id: " + this.id);
        System.out.println("Ten Dien Thoai: " + this.name);
        System.out.println("Gia Ban: " + this.price);
        System.out.println("Thoi gian bao hanh: " + this.warranty);
        System.out.println("Han san xuat: " + this.manufacturer);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


}
