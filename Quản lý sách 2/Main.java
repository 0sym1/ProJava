import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Manager store = new Manager();
        Admin adminAccount = new Admin();
        Guest guestAccount = new Guest();

        while (true){
            System.out.println("VUI LÒNG ĐĂNG NHẬP!");
            System.out.println("-Nhập 0 để thoát chương trình!-");
            System.out.print("Nhập tài khoản: ");
            String account = sc.nextLine();

            if(account.equals("0")) break;

            if(account.equals("khach")){
                guestAccount.guestLogin(sc, store);
                sc.nextLine();
            }
            else if(account.equals("admin")){
                String passWord;
                while (true){
                    System.out.print("Nhập password: ");
                    passWord = sc.nextLine();
                    if(passWord.equals("admin")) break;
                    else System.out.println("Sai password, vui lòng nhập lại!");
                }
                adminAccount.adminLogin(sc, store);
                sc.nextLine();
            }
            else {
                System.out.println("Không tìm thấy tài khoản!");
            }
        }
    }
}
//int n = sc.nextInt();
//sc.nextLine();
//String s = sc.nextLine();
//while (sc.hasNext()); // nhap ko gioi han
//double z = (double) 1/2;
//String s = String.format("%.5f",z); // in 5 so sau thap phan

//String.fomat("%03d",cnt);

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;

//Integer b = Integer.parseInt(sc.nextLine());