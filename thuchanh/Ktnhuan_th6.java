package bai1.thuchanh;

import java.util.Scanner;

public class Ktnhuan_th6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam kiem tra");
        int ktnam = sc.nextInt();
        if (ktnam % 4 == 0 && ktnam % 100 == 0 || ktnam % 100 == 0 && ktnam % 400 == 0) {
            System.out.println("Nam "+ ktnam + " la nam nhuan " );
        }else {
            System.out.println("Nam "+ ktnam + " la nam khong nhuan " );
        }
    }
}
