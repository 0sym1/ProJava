import java.util.Scanner;

public class InkPen extends Pen{
    private String ink;

    @Override
    public void inPut(Scanner sc) {
        super.inPut(sc);
        System.out.print("\tNhập loại mực: ");
        ink = sc.nextLine();
    }
    @Override
    public void outPutList() {
        super.outPutList();
        System.out.println("Loại mực: " + ink);
        System.out.println("------");
    }

    public void outPutTable() {
        super.outPutTable();
        System.out.printf("%60s-Loại mực: %s\n", " ", ink);
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
    public String getInk() {
        return ink;
    }
}
