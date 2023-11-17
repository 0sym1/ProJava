import java.util.Scanner;

public class Pencil extends Pen{
    private String stiffness;

    public void inPut(Scanner sc){
        super.inPut(sc);
        System.out.print("\tNhập độ cứng: ");
        stiffness = sc.nextLine();
    }

    public void outPutList(){
        super.outPutList();
        System.out.println("Độ cứng: " + stiffness);
        System.out.println("------");
    }

    public void outPutTable() {
        super.outPutTable();
        System.out.printf("%60s-Độ cứng: %s\n", " ", stiffness);
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
    public String getStiffness() {
        return stiffness;
    }
}
