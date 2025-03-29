package UngDungQuanLiDienThoai;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class MainPhoneXXX {

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();

    static {
        oldPhones.add(new OldPhone("DTC001", "Iphone 15 promax", 2000000.0, 6, "Apple", 95, "da qua su dung ,tinh trang tot"));
        oldPhones.add(new OldPhone("DTC002", "Iphone 12 promax", 900000.0, 6, "Apple", 75, "da qua su dung , bi nut nhe"));
        newPhones.add(new NewPhone("DTM001", "SamSung Galaxy A50", 11990000.0, 12, "android", 15));
        newPhones.add(new NewPhone("DTM002", "SamSung Galaxy B52", 10000000.0, 12, "android", 10));
    }

    public static void main(String[] args) {
        int choose;
        while (true) {
            do {
                System.out.println("--Chuong Trinh Quan Li Dien Thoai--");
                System.out.println("1. Xem danh sach dien thoai");
                System.out.println("2. Them moi");
                System.out.println("3. Cap nhat");
                System.out.println("4. Xoa");
                System.out.println("5. Sap xep theo gia");
                System.out.println("6. Tim kiem");
                System.out.println("7. Tinh tong tien");
                System.out.println("8. Giam gia cho dien thoai cu");
                System.out.println("9. Thoat");

                System.out.print("Moi ban lua chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        menuShowList();

                        break;
                    case 2:
                        menuAddNew();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        menuSort();
                        break;
                    case 6:
                        menuSearch();
                        break;

                    case 9:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le vui long nhap lai");
                }
            } while (choose < 1 || choose > 5);
        }
    }

    private static void menuShowList() {
        int choose;
        while (true) {
            do {
                System.out.println("Danh sach dien thoai");
                System.out.println("1. Xem tat ca");
                System.out.println("2. Xem dien thoai cu");
                System.out.println("3. Xem dien thoai moi");
                System.out.println("4. Tro ve menu chinh");
                System.out.println("Ban hay nhap vao lua chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("--Danh sach tat ca dien thoai--");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu" + (i + 1));
                            oldPhones.get(i).output();
                        }
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu" + (i + 1 + oldPhones.size()));
                            newPhones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("--Danh sach dien thoai cu--");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu" + (i + 1));
                            oldPhones.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("--Danh sach dien thoai moi--");
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu" + (i + 1));
                            newPhones.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le vui long chon lai!!");
                }
            } while (choose < 0 || choose > 4);
        }
    }

    private static void menuAddNew() {
        int choose;
        while (true) {
            do {
                System.out.println("Them moi dien thoai");
                System.out.println("1. Them moi dien thoai cu");
                System.out.println("2. Them moi dien thoai moi");
                System.out.println("3. Tro ve menu chinh");

                System.out.print("Moi ban nhap lua chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.input();
                        oldPhone.setId(getIdOldPhone());
                        oldPhones.add(oldPhone);
                        System.out.println("Them moi thanh cong");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.input();
                        newPhone.setId(getIdNewPhone());
                        newPhones.add(newPhone);
                        System.out.println("Them moi thanh cong");
                        break;

                    case 3:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le , vui long nhap lai!");
                }
            } while (choose < 1 || choose > 3);
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
        return String.format("DTC%3d", max + 1).replace(" ", "0");
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
        return String.format("DTH%3d", max + 1).replace(" ", "0");
    }

    private static void update() {
        System.out.println("Nhap vao ma muon cap nhat: ");
        String id = scanner.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExistPhone = false;
            for (OldPhone oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    oldPhone.input();
                    System.out.println("Cap nhat thanh cong");
                    break;
                }
            }
            if (!isExistPhone) {
                System.out.println("Khong tim thay ma nguon muon cap nhat.");
            }
        } else if (id.startsWith("DTM")) {
            boolean isExistPhone = false;
            for (NewPhone newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExistPhone = true;
                    newPhone.input();
                    System.out.println("Cap nhat thanh cong");
                    break;
                }
            }
            if (!isExistPhone) {
                System.out.println("Khong tim thay ma nguon muon cap nhat");
            }
        } else {
            System.out.println("Ma khong hop le!");
        }
    }

    private static void delete() {
        System.out.print("Nhap vao ma muon xoa: ");
        String id = scanner.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExistPhone = false;
            for (OldPhone oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExistPhone = true;
                    System.out.printf("Ban co xoa dien thoai co ma %s khong?\n", id);
                    System.out.println("Chon Yes de xac nhan xoa, No de huy");
                    if ("yes".equalsIgnoreCase(scanner.nextLine())) {
                        oldPhones.remove(oldPhone);
                        System.out.println("Xoa thanh cong!");
                    } else {
                        System.out.println("Da huy viec xoa");
                    }
                    break;
                }
            }
            if (!isExistPhone) {
                System.out.println("Khong tim thay ma muon xoa");
            }
        } else {
            System.out.println("Ma khong hop le");
        }

    }

    private static void menuSort() {
        int choose;
        while (true) {
            do {
                System.out.println("Sap xep Dien Thoai Theo Gia");
                System.out.println("1. Tang dan");
                System.out.println("2. Giam dan");
                System.out.println("3. Tro ve menu chinh");

                System.out.print("Moi ban nhap lua chon:  ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        sortByPriceAscending();
                        break;
                    case 2:
                        sortByPriceDescending();
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le, Vui long nhap lai!");
                }
            } while (choose < 0 || choose > 3);
        }
    }
    private static void sortByPriceAscending() {
        oldPhones.sort(Comparator.comparingDouble(OldPhone::getPrice));
        newPhones.sort(Comparator.comparingDouble(NewPhone::getPrice));
        System.out.println("Danh sach dien thoai da duoc sap xep tang dan theo gia!");
        menuShowList();
    }
    private static void sortByPriceDescending() {
        oldPhones.sort(Comparator.comparingDouble(OldPhone::getPrice).reversed());
        newPhones.sort(Comparator.comparingDouble(NewPhone::getPrice).reversed());
        System.out.println("Danh sach dien thoai da duoc sap xep giam dan theo gia!");
        menuShowList();
    }


    private static void menuSearch() {
        int choose;
        while (true) {
            do {
                System.out.println("Tim Kiem Dien Thoai");
                System.out.println("1. Tim kiem tat ca dien thoai");
                System.out.println("2. Tim kiem dien thoai cu");
                System.out.println("3. Tim kiem dien thoai moi");
                System.out.println("4. Tro ve menu chinh");

                System.out.print("Moi ban nhap lua chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        menuSearchAllPhone();
                        break;
                    case 2:
                        menuSearchOldPhone();
                        break;
                    case 3:
                        menuSearchNewPhone();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le, Vui long chon lai");
                }
            } while (choose < 0 || choose > 4);
        }
    }

    private static void menuSearchAllPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("TIM KIEM THEO TAT CA DIEN THOAI");
                System.out.println("1. Tiem kiem theo gia");
                System.out.println("2. Tiem kiem theo ten");
                System.out.println("3. Tiem kiem theo hang");
                System.out.println("4. Tro ve menu tim kiem");

                System.out.print("Moi ban lua chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le vui long chon lai");
                }
            } while (choose < 0 || choose > 4);
        }
    }

    private static void menuSearchOldPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("TIM KIEM THEO TAT CA DIEN THOAI");
                System.out.println("1. Tiem kiem theo gia");
                System.out.println("2. Tiem kiem theo ten");
                System.out.println("3. Tiem kiem theo hang");
                System.out.println("4. Tro ve menu tim kiem");

                System.out.print("Moi ban lua chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le vui long chon lai");
                }
            } while (choose < 0 || choose > 4);
        }
    }

    private static void menuSearchNewPhone() {
        int choose;
        while (true) {
            do {
                System.out.println("TIM KIEM THEO TAT CA DIEN THOAI");
                System.out.println("1. Tiem kiem theo gia");
                System.out.println("2. Tiem kiem theo ten");
                System.out.println("3. Tiem kiem theo hang");
                System.out.println("4. Tro ve menu tim kiem");

                System.out.print("Moi ban lua chon: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le vui long chon lai");
                }
            } while (choose < 0 || choose > 4);
        }
    }
}
