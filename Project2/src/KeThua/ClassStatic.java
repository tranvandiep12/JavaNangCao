package KeThua;

public class ClassStatic {
    int a = 1;
    static int b = 1; // Sử dụng chung cho tất cả đối tượng trong class

    public static void main(String[] args) {
        ClassStatic x = new ClassStatic();
        ClassStatic y = new ClassStatic();

        x.a++;
        x.b++;

        y.a++;
        y.b++;

        System.out.println("x.a++: " + x.a++);
        System.out.println("x.b++: " + x.b++);
    }
}
