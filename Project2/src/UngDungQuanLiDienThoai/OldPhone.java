
package UngDungQuanLiDienThoai;

import java.util.Scanner;


public class OldPhone extends Phone {
    private int batteryPercentage;
    private String description;

    public OldPhone() {

    }

    public OldPhone(String id, String name, double price, int warrnty, String manufacturer, int batteryPercentage, String description) {
        super(id, name, price, warrnty, manufacturer);
        this.batteryPercentage = batteryPercentage;
        this.description = description;
    }

    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tinh trang pin: ");
        this.batteryPercentage = Integer.parseInt(scanner.nextLine());
        System.out.print("Su mieu ta: ");
        this.description = scanner.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("Tinh trang pin(%): " + this.batteryPercentage);
        System.out.println("Mo ta them: " + this.description);
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
