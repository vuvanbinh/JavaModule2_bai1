package bai1.thuchanh;

import java.util.Scanner;

public class giaiPTb1th4 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap a");
        a = sc.nextInt();
        System.out.println(" Nhap b");
        b = sc.nextInt();
        if(a==0){
            System.out.println("Phuong trinh  vo nghiem");
        } else  if (b==0){
            System.out.println("Phuong trinh vo so nghiem");
        }else {
            System.out.println("Phuong trinh co nghiem "+(-b/a));
        }
    }
}
