package Static;

public class MainMathUtil {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 3;

        double xuatAdd = MathUtil.add(num1, num2);
        double xuatApartFrom = MathUtil.apartFrom(num1, num2);
        double xuatCore = MathUtil.core(num1, num2);
        double xuatDivide = MathUtil.divide(num1, num2);

        System.out.println("Tổng: " + xuatAdd);
        System.out.println("Hiệu: " + xuatApartFrom);
        System.out.println("Tích: " + xuatCore);
        System.out.println("Thương: " + xuatDivide);


    }
}
