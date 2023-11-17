import java.util.Scanner;

public class Items {
    protected String name;
    protected String cost;
    protected String brand;

    public void inPut(Scanner sc){
        System.out.print("\tNhập tên sản phẩm: ");
        name = sc.nextLine();
        System.out.print("\tNhập giá bán: ");
        cost = sc.nextLine();
        System.out.print("\tNhập thương hiệu: ");
        brand = sc.nextLine();
    }
    public void outPutTable(){
        System.out.printf("%-22s",name);
        System.out.printf("%-17s",cost);
        System.out.printf("%-21s",brand);

    }
    public void outPutList(){
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá bán: " + cost);
        System.out.println("Thương hiệu: " + brand);
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
}
