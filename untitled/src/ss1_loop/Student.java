package ss1_loop;

import java.util.Scanner;

public class Student {
    String name;
    Double mathScore;
    Double listeratureScore;

    void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên học sinh: ");
        name = scanner.nextLine();
        System.out.print("Nhâp vào điểm toán: ");
        mathScore = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập điểm văn: ");
        listeratureScore = Double.parseDouble(scanner.nextLine());
    }

    double calAvera() {
        return (mathScore + listeratureScore) / 2;
    }

    void output() {
        System.out.println("Name: " + name);
        System.out.println("Điểm toán: " + mathScore);
        System.out.println("Điểm văn: " + listeratureScore);
        System.out.println("Điểm trung bình: " + calAvera());
    }
}
