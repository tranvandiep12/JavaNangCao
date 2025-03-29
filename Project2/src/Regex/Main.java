package Regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("SV001".matches("SV[0-9][0-9][0-9]"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        if(input.matches("03[2-9][0-9]{7}")){
            System.out.println("Số hợp lệ: " + input);
        } else {
            System.out.println("Số không hợp lệ!");
        }
    }
}