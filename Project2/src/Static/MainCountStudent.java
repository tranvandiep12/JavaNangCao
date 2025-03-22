package Static;



public class MainCountStudent {
    public static void main(String[] args) {
        CountStusdent countStusdent = new CountStusdent(1234, "Trần Văn A", 7.9);
        CountStusdent countStusdent1 = new CountStusdent(3421, "Trần Văn B", 9);
        CountStusdent countStusdent2 = new CountStusdent(4321, "Trần Văn C", 5);

        System.out.println("Số Lượng là: " + CountStusdent.getCount() );

    }
}
