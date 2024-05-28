package day04_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_EnUzunKelime {
    public static void main(String[] args) {
        // Kullanıcıdan alınan cümledeki en uzun kelimeyi(veya kelimeleri) listeleyen bir kod yazınız.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=input.nextLine().trim();
        cumle=cumle.replaceAll("\\p{Punct}","");

        String []kelimeler= cumle.split(" ");
        System.out.println(kelimeler.length);
        int max=0;
        for (String each:kelimeler
        ) {
            max=Math.max(max,each.length());
        }
        List<String>enUzunKelimeler=new ArrayList<>();

        for (String each:kelimeler
        ) {
            if (max==each.length()){
                enUzunKelimeler.add(each);
            }
        }
        System.out.println(max);
        System.out.println(enUzunKelimeler);
    }
}