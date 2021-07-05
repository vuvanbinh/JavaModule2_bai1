package bai1.baitap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        final float cd = 23000;
        System.out.println(" Nhap USD can chuyen doi :");
        Scanner sc = new Scanner(System.in);
        float usd = sc.nextFloat();
        float vnd = usd*cd;
        System.out.printf(" So tien chuyen doi la : %f", vnd);
    }
}
