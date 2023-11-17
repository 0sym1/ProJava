import java.util.Scanner;

public class Book extends Items {
    private String author;
    private String genre;
    private  String publicationDate;
    private String NXB;
    private String languages;

    public void inPut(Scanner sc){
        super.inPut(sc);
        System.out.print("\tNhập thể loại: ");
        genre = sc.nextLine();
        System.out.print("\tNhập tác giả: ");
        author = sc.nextLine();
        System.out.print("\tNhập NXB: ");
        NXB = sc.nextLine();
        System.out.print("\tNhập năm XB: ");
        publicationDate = sc.nextLine();
        System.out.print("\tNhập ngôn ngữ: ");
        languages = sc.nextLine();
    }

    public void outPutList(){
        super.outPutList();
        System.out.println("Thể loại: " + genre);
        System.out.println("Tác giả: " + author);
        System.out.println("NXB: " + NXB);
        System.out.println("Năm XB: " + publicationDate);
        System.out.println("Ngôn ngữ: " + languages);
        System.out.println("------");
    }

    public void outPutTable(){
        super.outPutTable();
        System.out.println("-Thể loại: " + genre);
        System.out.printf("%60s-Tác giả: %s\n", " ", author);
        System.out.printf("%60s-NXB: %s\n", " ", NXB);
        System.out.printf("%60s-Năm XB: %s\n", " ", publicationDate);
        System.out.printf("%60s-Ngôn ngữ: %s\n", " ", languages);
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getNXB() {
        return NXB;
    }

    public String getLanguages() {
        return languages;
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
