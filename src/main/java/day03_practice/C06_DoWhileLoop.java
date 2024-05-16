package day03_practice;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
            Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
            Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

            kullanici bitirmek istediginde
            toplam kac adet pozitif tam sayi girdigini
            ve bunlarin toplaminin kac oldugunu yazdirin


            kullanici negatif sayi girerse
            "negatif sayi kullanamazsiniz " yazdirin
            bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        // Diger looplardan en onemli farki en az bir kere calismasidir

        Scanner input=new Scanner(System.in);
        int sayi;//scope
        int sayac=0;
        int toplam=0;
        do {
            System.out.println("lutfen bir tam sayi giriniz");
            sayi= input.nextInt();
            if (sayi>0) {
                sayac++;
                toplam += sayi;//toplam=toplam+sayi;
            } else if (sayi<0) {
                System.out.println("negatif sayi kullanamazsiniz");
            }

        }while (sayi!=0);
        System.out.println("toplam "+sayac+" adet sayi girdiniz.\nve bunlarin toplamlari : "+toplam);

    }
}
