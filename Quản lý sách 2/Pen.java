import java.util.Scanner;

public class Pen extends Items{
    protected String color;
    protected String material;

    public void inPut(Scanner sc){
        super.inPut(sc);
        System.out.print("\tNhập màu sắc: ");
        color = sc.nextLine();
        System.out.print("\tNhập chất liệu: ");
        material = sc.nextLine();
    }

    public void outPutList(){
        super.outPutList();
        System.out.println("Màu sắc: " + color);
        System.out.println("Chất liệu: " + material);
    }

    public void outPutTable() {
        super.outPutTable();
        System.out.printf("-Màu sắc: %s\n",color);
        System.out.printf("%60s-Chất liệu : %s\n", " ", material);
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
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
