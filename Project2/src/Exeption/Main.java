package Exeption;

public class Main {
    public static void main(String[] args) {
       try {
           input(10);
       } catch (Under18years e){
           System.out.println(e.getMessage());
       }
        System.out.println("Chuonge tình kết thúc");
    }
    public static void input(int age){
        throw new Under18years("Bạn chưa đủ tuổi");
    }

}
