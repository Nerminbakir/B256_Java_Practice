package day03_practice;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
         /*
              Kullanicidan bir kelime sisteme girmesini isteyiniz.
              kelimede ilk c harfi rastlanilana kadar a harflerinin sayisini yazdiriniz.
         */

        // babacan --> 2

        // bir yapının tüm elemanlarını tek tek gözden geçirmemiz gereken durumlarda forloop ya da loop döngüleri kullanılır

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen en sevdiginiz kelimeyi sisteme giriniz");
        String str=input.next();//babacan//kedi

        //3 kısımdan olusur
        //ilk kısım baslangic degeri  //ikinci kısım condition   //3. kısım artis miktari  //4. kısım tekrar etmesini istedigimiz kodu yazdıgımız yer
        int sayac=0;
        for (int i=0;                      i<str.length();                      i++ ) {//i<str.length(); yerine i<=str.length()-1; kullanabilirsiniz

            if (str.charAt(i)=='a') {
                sayac++;//sayac+=1;sayac=sayac+1; //increment
            } else if (str.charAt(i)=='c') {
                break;//kır donguyu kırıp dongu sonrasinda for sonu isimli parantezden sonrasi devam eder
            }


        }//for sonu
        System.out.println(sayac);//3

    }//main sonu
}//class sonu

