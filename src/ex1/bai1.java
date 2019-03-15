package ex1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int n;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("nhap so n");
        n = Scanner.nextInt();
        if (snt(n) == true) System.out.println("so nguyen to ");
        else System.out.println("khong phai so nguyen to");
    }
    public static boolean snt(int n){
        if (n == 0 || n == 1) return false;
        for (int i = 2 ; i <= n - 1 ; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}
