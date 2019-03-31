package ex2;

import java.util.Scanner;

public class nhanvien {

    public String name;
    public int age;
    public String address;
    public double salary;
    public int worktime;

    public void inputInfo() {
        System.out.println("nhap thong tin nhan vien");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.println("nhap tuoi");
        age = scanner.nextInt();

        System.out.println("nhap dia chi");
        address = scanner.nextLine();


        System.out.println("nhap tien luong");
        salary = scanner.nextDouble();

        System.out.println("nhap thoi gian lam");
        worktime = scanner.nextInt();
    }

    public void printInfo() {
        System.out.println("thong tin nhan vien");
        System.out.println(name + " - tuoi:" + age);
    }

    public double tinhthuong() {
        double thuong = 0;
        if (worktime >= 200) {
            thuong = salary * 20 / 100;
        } else if (worktime < 200 && worktime >= 100) {
            thuong = salary * 10 / 100;
        }
        return thuong;

    }
    public static void main(String[] args){
        nhanvien nhanvien1 = new nhanvien();
        nhanvien1.inputInfo();
        nhanvien1.printInfo();
        System.out.println("tien thuong cua nhan vien"+nhanvien1.tinhthuong());
        nhanvien nhanvien2 =  new nhanvien();
    }
}
