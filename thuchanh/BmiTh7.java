package bai1.thuchanh;

import java.util.Scanner;

public class BmiTh7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap can nang :");
        float weight  = sc.nextFloat();
        System.out.println(" Nhap chieu cao :");
        float height  = sc.nextFloat();
        float bmi = (float) (weight/Math.pow(height ,2));
        System.out.println("BMI cua ban la: "+ bmi);
        if(bmi<18.5){
            System.out.println( " Voi BMI : "+bmi+" Ban con thieu can");
        }else if(bmi<24.9){
            System.out.println(" Voi BMI : "+bmi+" Ban binh thuong");
        }else {
            System.out.println(" Voi BMI : "+bmi+" Ban thua can");
        }
    }
}
