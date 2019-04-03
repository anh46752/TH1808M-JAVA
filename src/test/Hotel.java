package test;

import java.util.Scanner;

public class Hotel {

    public String name;
    public String location;
    public String ownerName;

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void storeHotel(){

    }

    public void newHotel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thong tin");

        System.out.println("nhap vao ten");
        this.setName(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("nhap vi tri");
        this.setName(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("nhap ten nguoi dung");
        this.setName(scanner.hasNext()?scanner.nextLine():"");

    }





    public class MainExam {
        public static void main(String[] args){
//        Hotel 1-10
            Hotel hotel=new Hotel();
            hotel.storeHotel();


            Hotel hotel1=new Hotel();
            hotel1.storeHotel();

            Hotel hotel2=new Hotel();
            hotel2.storeHotel();


            Hotel hotel3=new Hotel();
            hotel3.storeHotel();


            Hotel hotel4=new Hotel();
            hotel4.storeHotel();


            Hotel hotel5=new Hotel();
            hotel5.storeHotel();


            Hotel hotel6=new Hotel();
            hotel6.storeHotel();


            Hotel hotel7=new Hotel();
            hotel7.storeHotel();


            Hotel hotel8=new Hotel();
            hotel8.storeHotel();


            Hotel hotel9=new Hotel();
            hotel9.storeHotel();

            hotel.storeHotel();
            hotel1.storeHotel();
            hotel2.storeHotel();
            hotel3.storeHotel();
            hotel4.storeHotel();
            hotel5.storeHotel();
            hotel6.storeHotel();
            hotel7.storeHotel();
            hotel8.storeHotel();
            hotel9.storeHotel();


    }
}
