package day05_practice;

import java.util.Scanner;

public class C03_HesapMakinesi {
    public static void main(String[] args) {

         /*
            Basit 4 islem yapan bir hesap makinesi kodlayiniz
            Kullanicidan yapacagi islemi islem sembolu ile ( + - / * ) secmesini isteyiniz
            Kullanicinin 2 sayi girmesini isteyiniz
            Girilen islem ve sayilara gore dogru sonucu ekrana yazdiriniz
        */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen islem yapmak istediginiz islemi seciniz : + , - , * , / ");
        char islem=input.next().charAt(0);
        if (islem=='+'||islem=='-'||islem=='*'||islem=='/'){
            System.out.println("lutfen silem yapmak sayilari giriniz\nBirinci sayi:");
            double sayi1=input.nextDouble();
            System.out.println("İkinci sayi : ");
            double sayi2= input.nextDouble();
            hesapMakinesi(sayi1,sayi2,islem);

        }else {
            System.out.println("Hatali giriş");
        }
    }//main method sonu

    public static void hesapMakinesi(double sayi1,double sayi2,char operator){//parametre
        switch (operator){
            case '+':
                System.out.println(sayi1+"+"+sayi2+" = "+(sayi1+sayi2));
                break;
            case '-':
                System.out.println(sayi1+"-"+sayi2+" = "+(sayi1-sayi2));
                break;
            case '*':
                System.out.println(sayi1+"*"+sayi2+" = "+(sayi1*sayi2));
                break;
            case '/':
                if (sayi2==0){
                    System.out.println("payda 0 olamaz!!!");
                }else {
                    System.out.println(sayi1 + "/" + sayi2 + " = " + (sayi1 / sayi2));
                }
                break;

        }

    }

}
