package ConstructorAccessModifier;

public class MainStudent {
    public static void main(String[] args) {
           Student student1 = new Student(1234, "Trần Văn Điệp",7);

        System.out.println("Thông tin ban đầu");
        System.out.println("ID: " + student1.getId());
        System.out.println("Tên: " + student1.getName());
        System.out.println("Điểm số: " + student1.getScore());


        student1.setName("Trần Văn Điệp");
        student1.setScore(5);


        System.out.println("Thông tin sau khi cập nhật");
        System.out.println("ID: " + student1.getId());
        System.out.println("Tên: " + student1.getName());
        System.out.println("Điểm số: " + student1.getScore());

        student1.setName("  ");
        student1.setScore(11);


    }
}
