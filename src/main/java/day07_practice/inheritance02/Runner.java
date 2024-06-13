package day07_practice.inheritance02;

public class Runner {
    public static void main(String[] args) {

        Corsa araba1=new Corsa();
        System.out.println("araba1.hareket = " + araba1.hareket);//araba
        System.out.println("araba1.marka = " + araba1.marka);//opel
        System.out.println("araba1.hiz = " + araba1.hiz);//corsa

        //!!! fieldlarda referance data tipinden başlar
        //yoksa parentlara bakar, ilk bulduğu değeri getirir

        araba1.motor();//corsa
        araba1.yakitTuketimi();//opel


        Opel araba2=new Corsa();
        System.out.println("araba2.hareket = " + araba2.hareket);//araba
        System.out.println("araba2.hiz = " + araba2.hiz);//220

        araba2.motor();//corsa


        Opel araba3=new Astra();//opel
        System.out.println("araba3.hiz = " + araba3.hiz);//220-opel
        System.out.println("araba3.marka = " + araba3.marka);//opel
        System.out.println("araba3.yakit = " + araba3.yakit);//araba

        araba3.motor();//opel


        //methodlarda referans data tipine bakılır
        //metod varsa constructor data tipine kadar
        //child classlarda override edilmişse
        //en son hali çağırılır.Override edilmediyse
        //mevcut metod çağrılır.


        Araba araba4=new Corsa();//araba
        System.out.println("araba4.hareket = " + araba4.hareket);//araba
        //araba4.model-->arabada yok

        araba4.motor();//corsa
        araba4.yakitTuketimi();//opel
        //araba4.garanti()-->yok

        araba4=new Opel();
        araba4=new Astra();

    }
}
