package day05_practice;

import java.util.Arrays;
import java.util.Scanner;

public class C04_FahrenheitToCelcius {
    public static void main(String[] args) {

        // Fahrenheit degeri, Celsius degere ceviren method yaziniz.
        // formul : c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdigimde bana celsius cinsinden sicaklik donmeli
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen fahrenheit cinsinden sicaklik degerini giriniz");
        double fahrenheit = input.nextDouble();
        //fahrToCels(fahrenheit);//bu işlemin sonucu olarak bir deger donduruyor
        //1.yol
        double celsius=fahrToCels(fahrenheit);
        System.out.println(celsius);
        //2.yol
        System.out.println(fahrToCels(fahrenheit));

        //bir methodu kisa yoldan olusturma yontemleri
        //1. methoda verecegimiz ismi yazmak --size kalmis-- methodlar daima kucuk harfle baslar
        //2. method parantezi
        //3. method parametleri methoda gondermek istedigimiz degerleri method parantezi icinde aralarında virgul olarak yazıyoruz
        //4. methodu create etmesi icin javaya komut veriyoruz
    }

    public static double fahrToCels(double fahrenheit) {
        // formul : c = (f-32)/1.8
        double celcius=(fahrenheit-32)/1.8;
        return celcius;
    }


}