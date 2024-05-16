package day03_practice;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {
        /*
        toLowerCase:harfleri kucultmeyi saglar
        toUpperCase:harfleri buyultmeyi saglar
        length:karakter sayisini yani uzunlugunu verir
        equals:esit mi diye kontrol eder (peki == farki nedir =='hem adrese hem degere bakar fakat equals methodu sadece degere bakar)
        equalsIgnoreCase:buyuk kucuk harf farketmeksizin esit mi diye kontrol eder
        indexOf:girilen karakterin ilk indexini dondurur
        lastIndexOf:girilen karakterin son indexini dondurur
        charAt:girilen indexteki karakteri dondurur
        trim:bastaki ve sondaki bosluklari siler
        split:icine girilen degerden boler sag ve sol olmak uzere secim yaptırır(0 sol/1 sag)
        replace:icindeki datayi degistirmeyi saglar
        replaceAll:icindeki datyi gruplar halinde(regex) degistirmeyi saglar
        concat:birlestirme islemi yapar
        subString:ilk girilen indexten ikinci indexe kadar(ikinci index dahil degildir) olan degeri bize dondurur
        valueOf:String'i baska dataya baska datalari String'e cevirmeyi saglar.
        contains:icerme durumunu kontrol eder
        endsWith:ne ile bittigini kontrol eder
        startsWith:ne ile basladigini kontrol eder
        isBlank:hem bos mu diye kontrol eder bos degilse sadece bosluk karakter var mi diye kontrol eder
        isEmpty:bos mu diye kontrol eder
         */

         /*
            oKullanicidan ad ve soyadini aralarinda bir bsluk olacak sekilde sisteme girmesini isteyiniz.
            NOT : Yalnizca bir ad bir soyad girilmeli
            Ad v                                                                                                                                                                                                                                   i ilk harfleri buyuk olacak sekilde alt alta yazdirin
            Ad : Canan
            Soyad : Can
        */

        //String str="Java bugün cok kolay geciyor";
        //System.out.println(str.split(" ")[3]);

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir adinizi ve soyadinizi sirasiyla giriniz");
        String isim=input.nextLine().trim();//canan can;
        System.out.println("kullanicidan aldigim orjinal deger : "+isim);
        System.out.println("isim : "+isim.toUpperCase().charAt(0) + isim.substring(1, isim.indexOf(" ")));
        System.out.println("soyIsim : "+isim.split(" ")[1].toUpperCase().charAt(0)
                + isim.split(" ")[1].substring(1));

        //length() methodu String'in uzunlugunu dondurur.1’den baslar
        int uzunluk=isim.length();
        System.out.println("ismin uzunlugu : "+uzunluk);

        //charAt(int index) metodu, belirtilen index’te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.
        char karakter=isim.charAt(isim.length()-1);//0 dısında karakter girmeyiz bu hard coding olur ve hata alma olasiligi fazlasiyla artmıs olur
        System.out.println(karakter);//n

        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring'i döndürür.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)
        String ad=isim.substring(0,isim.indexOf(" "));
        System.out.println(ad);//sadece ad bilgisini icerir

        //startsWith() methodu bir Strig’in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.
        boolean aliIleBasliyorMu=isim.toLowerCase().startsWith("ali");
        System.out.println(aliIleBasliyorMu);

        // trim(): kullanicinin yanlislikla space girme ihtimaline karsi basta ve sondaki butun space leri siler

    }
}
