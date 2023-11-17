import java.util.Scanner;

public class Guest {
    void guestLogin(Scanner sc, Manager store){
        while (true){
            System.out.println("------");
            System.out.println("1: Tra cứu items");
            System.out.println("2: Xem danh sách items ");
            System.out.println("3: Thoát");
            System.out.println("------");
            System.out.print("Nhập lựa chọn: ");

            int choose = sc.nextInt();

            switch (choose){
                case 1:
                    store.searchItems(sc);
                    break;
                case 2:
                    store.seeAllItems(sc);
                    break;
                case 3:
                    return;
            }
        }
    }
}
