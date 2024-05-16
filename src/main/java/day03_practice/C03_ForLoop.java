package day03_practice;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
         /*
               Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
               Bu sayılardan birler basamağı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz
         */

        // Java da her zaman için kısa ve anlaşılır kodlar daha iyidir. Java hiç bir zaman tekrarı sevmez

        Scanner input=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i < 6; i++) {//
            System.out.println("lutfen "+i+". sayiyi giriniz");//1. sayi 2. sayi 3. sayi
            int sayi= input.nextInt();

            if (sayi%10==7||sayi%10==9){
                continue;//keyword//continue ise donguyu basa sar demek
                //break;//donguyu kır
            }
            toplam+=sayi;

        }//for sonu
        System.out.println("toplam = " + toplam);

    }
}
