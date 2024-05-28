package day04_practice;
import java.util.Arrays;
import java.util.Scanner;

public class C02_Arrays {
    public static void main(String[] args) {
        /*
            3 elemanlı bir array olusturunuz (int)
            Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
            Arrayin elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
            Ortalamadan daha büyük olan array elemanlarını yazdırınız.
        */
        //int []arr={1,2,3,4,5,6,7};//[] dizi parantezi yani array yapısı oldugunu belli eder
        int []arr=new int[3];//3 elemanli bir bos array olusturmus oluruz
        Scanner input=new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("lutfen arrayin "+(i+1)+". elemanını giriniz");
            arr[i]= input.nextInt();
        }
        //System.out.println("lutfen arrayin 1. elemanini giriniz");
        //arr[0] = input.nextInt();
        //System.out.println("lutfen arrayin 2. elemanini giriniz");
        //arr[1] = input.nextInt();
        //System.out.println("lutfen arrayin 3. elemanini giriniz");
        //arr[2] = input.nextInt();

        System.out.println(Arrays.toString(arr));
        //foreach dongusunu elemanlarla işimiz oldugu zaman kullaniriz
        //fori dongusunu indexlerle isimiz oldugu zaman kullaniriz
        double sum=0;
        //elemanların toplamını bulmak icin olusturduk
        for (int each:arr
        ) {
            sum+=each;//sum=sum+each;
        }
        double ort=sum/arr.length;
        System.out.println("ortalama : "+ort);
        //ortalamadan buyuk degerleri yazdırmak icin olusturduk
        for (int each:arr
        ) {
            if (each>ort){
                System.out.println(each);
            }
        }
    }
}