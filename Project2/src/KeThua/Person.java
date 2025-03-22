package KeThua;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;

    public Person() {

    }

    void input() {
        Scanner scanner = new Scanner(System.in);
        this.id = (int) (Math.random() * 10000);
        System.out.print("Nhập vào tên: ");
        this.name = scanner.nextLine();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void output() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
