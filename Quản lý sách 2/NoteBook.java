import java.util.Scanner;

public class NoteBook extends Items {
    private String page;
    private String genre;
    private String color;
    private String material;
    private String size;
    public void inPut(Scanner sc){
        super.inPut(sc);
        System.out.print("\nNhập số trang: ");
        page = sc.nextLine();
        System.out.print("\nNhập loại vở: ");
        genre = sc.nextLine();
        System.out.print("\nNhập màu sắc bìa: ");
        color = sc.nextLine();
        System.out.print("\nNhập chất liệu giấy: ");
        material = sc.nextLine();
        System.out.print("\nNhập kích thước: ");
        size = sc.nextLine();
    }

    public void outPutList(){
        super.outPutList();
        System.out.println("Số trang: " + page);
        System.out.println("Thể loại: " + genre);
        System.out.println("Màu sắc: " + color);
        System.out.println("Chất liệu giấy: " + material);
        System.out.println("Kích thước: " + size);
        System.out.println("------");
    }

    @Override
    public void outPutTable() {
        super.outPutTable();
        System.out.println("-Số trang: " + page);
        System.out.printf("%60s-Thể loại: %s\n", " ", genre);
        System.out.printf("%60s-Màu sắc: %s\n", " ", color);
        System.out.printf("%60s-Chất liệu giấy: %s\n", " ", material);
        System.out.printf("%60s-Kích thước: %s\n", " ", size);
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }
    public String getPage() {
        return page;
    }

    public String getGenre() {
        return genre;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
}
