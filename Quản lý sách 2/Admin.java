import java.util.Scanner;

public class Admin {
    void adminLogin(Scanner sc, Manager store){
        while (true){
            System.out.println("------");
            System.out.println("1: Thêm items");
            System.out.println("2: Xóa items");
            System.out.println("3: Sửa items");
            System.out.println("4: Các chức năng của khách");
            System.out.println("5: thoát");
            System.out.println("------");
            System.out.print("Nhập lựa chọn: ");

            int choose = sc.nextInt();

            switch (choose){
                case 1:
                    store.addItems(sc);
                    break;
                case 2:
                    store.deleteItems(sc);
                    break;
                case 3:
                    store.editItems(sc);
                    break;
                case 4:
                    Guest guestAccountTmp = new Guest();
                    guestAccountTmp.guestLogin(sc, store);
                    break;
                case 5:
                    return;
            }
        }
    }
}
