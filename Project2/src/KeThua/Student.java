package KeThua;

import java.util.Scanner;

public class Student extends Person {
    private double score;

    public Student() {
        super(); // gọi lên contructor (super của lớp cha)
    }

    public Student(int id, String name) {
        super(id, name);
        this.score = score;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Nhập vào điểm: ");
        this.score = Double.parseDouble(scanner.nextLine());
    }

    public void output() {
        super.output();
        System.out.println("Điêm: " + this.score);
    }
}
