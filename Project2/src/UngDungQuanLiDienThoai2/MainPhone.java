package UngDungQuanLiDienThoai2;


import java.util.ArrayList;
import java.util.Scanner;

public class MainPhone {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();

    static {
        oldPhones.add(new OldPhone("DTC001", "IPhone 15 Promax", 2000.0, 6, "Apple", 95, "Đã qua sử dụng, tình trạng tốt"));
        oldPhones.add(new OldPhone("DTC002", "IPhone 13 Plus", 1500.0, 6, "Apple", 98, "Đã qua sử dụng, tình trạng tốt"));
        newPhones.add(new NewPhone("DTM003", "ViVo A35 PLus", 3000.0, 12, "Androi", 9));
        newPhones.add(new NewPhone("DTM004", "OPPO A3S PLus", 6000.0, 12, "Androi", 19));
    }

    public static void main(String[] args) {
        int luaChon;
        while (true) {
            do {
                System.out.println("----CHƯƠNG TRÌNH QUẢN LÍ ĐIỆN THOẠI--------");
                System.out.println("1. Xem dánh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xoá");
                System.out.println("5. Xắp xếp theo giá");
                System.out.println("6. Tìm kiếm");
                System.out.println("7. Tính tổng tiền");
                System.out.println("8. Giảm giá cho điện thoại cũ");
                System.out.println("9. Thoát");


                System.out.print("Bạn hãy nhập lựa chọn: ");
                luaChon = Integer.parseInt(scanner.nextLine());

                switch (luaChon) {
                    case 1:
                        menuShowList();
                        break;
                    case 2:
                        menuAddNew();
                        break;
//                    case 3:
//                        update();
//                        break;
//                    case 4:
//                        delete();
//                        break;
//                    case 5:
//                        menuShort();
//                        break;
//                    case 6:
//                        menuSearch();
//                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại");
                }
            } while (luaChon < 1 || luaChon > 5);
        }
    }

    private static void menuShowList() {
        int luaChon;
        while (true) {
            do {
                System.out.println("--XEM DANH SÁCH ĐIỆN THOẠI--");
                System.out.println("1. Xem tất cả");
                System.out.println("2. Xem điện thoại cũ");
                System.out.println("3. Xem điện thoại mới");
                System.out.println("4. Trở về menu chính");

                System.out.print("Bạn hãy nhập vào lựa chọn: ");
                luaChon = Integer.parseInt(scanner.nextLine());

                switch (luaChon) {
                    case 1:
                        System.out.println("----Danh sách điệm thoại lần lượt------------");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1));
                            newPhones.get(i).output();
                        }
                        break;

                    case 2:
                        System.out.println("---Danh Sách Điện Thoại Cũ-------");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("---Danh Sách Điện Thoại Mới---------");
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thông tin điện thoại thứ: " + (i + 1));
                            newPhones.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, Vui lòng nhập lại");
                }
            } while (luaChon < 1 || luaChon > 4);
        }
    }

    private static void menuAddNew() {
        int luaChon;
        while (true) {
            do {
                System.out.println("--THÊM MỚI ĐIỆN THOẠI");
                System.out.println("1. Thêm mới điện thoại cũ");
                System.out.println("2. Thêm mới điện thoại mới");
                System.out.println("3. Trở về menu chinh");

                System.out.print("Hãy nhập lựa chọn: ");
                luaChon = Integer.parseInt(scanner.nextLine());

                switch (luaChon) {
                    case 1:
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.input();
                        oldPhone.setId(getIdOldPhone());
                        oldPhones.add(oldPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(getIdNewPhone());
                        newPhones.add(newPhone);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại");
                }
            } while (luaChon < 1 || luaChon > 3);
        }
    }

    private static String getIdOldPhone() {
        if (oldPhones.size() == 0) {
            return "DTC001";
        }
        int max = Integer.parseInt(oldPhones.get(0).getId().substring(3));
        for (int i = 1; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        return String.format("DTC%3d", max + 1).replace("", "0");
    }

    private static String getIdNewPhone() {
        if (newPhones.size() == 0) {
            return "DTM001";
        }
        int max = Integer.parseInt(newPhones.get(0).getId().substring(3));

        for (int i = 1; i < newPhones.size(); i++) {
            int id = Integer.parseInt(newPhones.get(i).getId().substring(3));
            if (max < id) {
                max = id;
            }
        }
        return String.format("DTC%3d", max + 1).replace("", "0");
    }
//    private static void menuShort(){
//        int luaChon;
//        while(true){
//            do{
//                System.out.println("Sắp xếp điện thoại theo giá");
//                System.out.println("1. Tăng dần");
//                System.out.println("2. Giảm dần");
//                System.out.println("3. Trở về menu chính");
//
//                System.out.print("Bạn hãy nhập vào lựa chọn: ");
//                luaChon = Integer.parseInt(scanner.nextLine());
//
//                switch (luaChon){
//                    case 1:
//                }
//            } while ();
//        }
//    }
}
