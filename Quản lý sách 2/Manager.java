import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manager {
    ArrayList<Items> list;
    public Manager(){
        list = new ArrayList<Items>();
    }

    public void addItems(Scanner sc){
        System.out.println("------");
        System.out.println("Nhập items muốn thêm: ");
        System.out.println("1: Vở ghi");
        System.out.println("2: Bút chì");
        System.out.println("3: Bút mực");
        System.out.println("4: Sách");
        System.out.println("------");
        System.out.print("Nhập lựa chọn: ");

        int chooseItems = sc.nextInt();

        switch (chooseItems){
            case 1:
                System.out.print("Nhập số lượng Vở ghi muốn thêm: ");
                int soLuongVo = sc.nextInt();
                sc.nextLine();
                for(int i=1 ; i<=soLuongVo ; i++){
                    System.out.println("Thêm lần " + i);
                    NoteBook tmp = new NoteBook();
                    tmp.inPut(sc);
                    list.add(tmp);
                }
                break;

            case 2:
                System.out.print("Nhập số lượng Bút chì muốn thêm: ");
                int soLuongButChi = sc.nextInt();
                sc.nextLine();
                for(int i=1 ; i<=soLuongButChi ; i++){
                    System.out.println("Thêm lần " + i);
                    Pencil tmp = new Pencil();
                    tmp.inPut(sc);
                    list.add(tmp);
                }
                break;

            case 3:
                System.out.print("Nhập số lượng Bút mực muốn thêm: ");
                int soLuongButMuc = sc.nextInt();
                sc.nextLine();
                for(int i=1 ; i<=soLuongButMuc ; i++){
                    System.out.println("Thêm lần " + i);
                    InkPen tmp = new InkPen();
                    tmp.inPut(sc);
                    list.add(tmp);
                }
                break;

            case 4:
                System.out.print("Nhập số lượng Sách muốn thêm: ");
                int soLuongButSach = sc.nextInt();
                sc.nextLine();
                for(int i=1 ; i<=soLuongButSach ; i++){
                    System.out.println("Thêm lần " + i);
                    Book tmp = new Book();
                    tmp.inPut(sc);
                    list.add(tmp);
                }
                break;
        }
    }

    public void deleteItems(Scanner sc){
        System.out.print("Nhập số lượng items muốn xóa: ");
        int delete = sc.nextInt();
        for(int i=1 ; i<=delete ; i++){
            int id = 1;
            for(Items it : list){
                System.out.println("ID: " + id);
                it.outPutList();
                id++;
            }
            System.out.println("lần xóa thứ " + i);
            int idDelete;
            while (true){
                System.out.print("Nhập ID muốn xóa: ");
                idDelete = sc.nextInt();
                if(idDelete > list.size() || idDelete <= 0){
                    System.out.println("ID không hợp lệ, vui lòng nhập lại!");
                }
                else {
                    System.out.println("Xóa items thành công!");
                    break;
                }
            }
            list.remove(idDelete-1);
        }
    }

    public void editItems(Scanner sc){
        System.out.print("Nhập số lượng items muốn sửa: ");
        int edit = sc.nextInt();
        System.out.println("------");
        int id = 1;
        for(Items it : list){
            System.out.println("ID: " + id);
            it.outPutList();
            id++;
        }
        for(int i=1 ; i<=edit ; i++){
            System.out.println("Sửa lần " + i);
            int idEdit ;
            while (true){
                System.out.print("Nhập ID items muốn sửa: ");
                idEdit = sc.nextInt();
                if(idEdit > list.size() || idEdit <= 0){
                    System.out.println("ID không hợp lệ, vui lòng nhập lại!");
                }
                else {
                    break;
                }
            }
            sc.nextLine();
            list.get(idEdit-1).inPut(sc);
            System.out.println("Sửa items thành công!");
            System.out.println("------");
            list.get(idEdit-1).outPutList();
        }
    }

    public void searchItems(Scanner sc){
        System.out.print("Nhập từ khóa muốn tìm kiếm: ");
        sc.nextLine();
        String keyWord = sc.nextLine();
        System.out.println("------");
        ArrayList<Items> search = new ArrayList<Items>();
        for(Items it : list){
            if(it instanceof Book){
                if(((Book)it).getBrand().contains(keyWord) || ((Book)it).getAuthor().contains(keyWord) || ((Book)it).getName().contains(keyWord) || ((Book)it).getGenre().contains(keyWord) || ((Book)it).getLanguages().contains(keyWord) || ((Book)it).getNXB().contains(keyWord) || ((Book)it).getPublicationDate().contains(keyWord) || ((Book)it).getCost().contains(keyWord)){
                    search.add(it);
                }
            }
            else if(it instanceof NoteBook){
                if(((NoteBook)it).getBrand().contains(keyWord) || ((NoteBook)it).getPage().contains(keyWord) || ((NoteBook)it).getName().contains(keyWord) || ((NoteBook)it).getGenre().contains(keyWord) || ((NoteBook)it).getColor().contains(keyWord) || ((NoteBook)it).getMaterial().contains(keyWord) || ((NoteBook)it).getSize().contains(keyWord) || ((NoteBook)it).getCost().contains(keyWord)){
                    search.add(it);
                }
            }
            else if(it instanceof Pencil){
                if(((Pencil)it).getBrand().contains(keyWord) || ((Pencil)it).getStiffness().contains(keyWord) || ((Pencil)it).getName().contains(keyWord) || ((Pencil)it).getColor().contains(keyWord) || ((Pencil)it).getMaterial().contains(keyWord) || ((Pencil)it).getCost().contains(keyWord)){
                    search.add(it);
                }
            }
            else if(it instanceof InkPen){
                if(((InkPen)it).getBrand().contains(keyWord) || ((InkPen)it).getInk().contains(keyWord) || ((InkPen)it).getName().contains(keyWord) || ((InkPen)it).getColor().contains(keyWord) || ((InkPen)it).getMaterial().contains(keyWord) || ((InkPen)it).getCost().contains(keyWord)){
                    search.add(it);
                }
            }
        }
        if(search.size() == 0) System.out.println("404 Not Found!");
        else {
            System.out.println("1: Xem ở dạng bảng");
            System.out.println("2: Xem ở dạng danh sách");
            System.out.print("Nhập lựa chọn: ");
            int choose = sc.nextInt();

            switch (choose){
                case 1:
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.printf("Tên sản phẩm%10s"," ");
                    System.out.printf("Giá bán%10s"," ");
                    System.out.printf("Thương hiệu%10s"," ");
                    System.out.println("Thông tin thêm");
                    System.out.println("---------------------------------------------------------------------------");
                    for(Items it : search){
                        it.outPutTable();
                        System.out.println("---------------------------------------------------------------------------");
                    }
                    break;

                case 2:
                    for(Items it : search){
                        it.outPutList();
                    }
            }
        }
    }

    public void seeAllItems(Scanner sc){
        System.out.println("1: Xem ở dạng bảng");
        System.out.println("2: Xem ở dạng danh sách");
        System.out.print("Nhập lựa chọn: ");

        int choose = sc.nextInt();
        switch (choose){
            case 1:
                System.out.println("---------------------------------------------------------------------------");
                System.out.printf("Tên sản phẩm%10s"," ");
                System.out.printf("Giá bán%10s"," ");
                System.out.printf("Thương hiệu%10s"," ");
                System.out.println("Thông tin thêm");
                System.out.println("---------------------------------------------------------------------------");
                for(Items it : list){
                    it.outPutTable();
                    System.out.println("---------------------------------------------------------------------------");
                }
                break;

            case 2:
                for(Items it : list){
                    it.outPutList();
                }
        }
    }
}
