package day06_practice;
public class C03_StaticKeyword {
    /*
       scope: Etki Alanı/Kapsam -> Değişken ve Method'ların nerede geçerli olduklarını belirtir.

       1: static variable
       2: instance variable
       3: local variable
       4: loop variable
       //1: static variable //herkes icin ayni olan deger diyebiliriz
       //2: instance variable //herkese/kisiye ait olan ozel deger
       //3: local variable //ihtiyac halinde kullanılan kullan at variable'lar
       //4: loop variable //loop parantezlerinin icinde bulunan variable'lar
*/
    /*
            - Bir class'ta instance, static değişkenler oluşturunuz.
            - Instance ve static 2 method oluşturunuz.
            - Bir main method, içerisinde 2 adet obje oluşturunuz, yazdırınız.
            - static variable değerini arttırınız.
            - obj1 instance variable'ını güncelleyiniz.
            - obj2'nin instance ve static değerini arttırınız.
            - obj1 ve obj 2'nin instance değerlerini yazdırınız.
     */
    int instanceSayi=5;//variable'lar defualt olarak class icinde olusturdugumuzda instance olarak olusur
    static int staticSayi=10;//static olarak belirtmemiz gerekiyor

    //bu kısımda local variable olusturamam cunku local variable bir methodun icinde ihtiyac halinde olusturulan bir yapı idi.
    //bu kısımda loop variable olusturamam cunku looplar methodlar icinde olusturabilir

    public void method1(){
        String str="Instance Method";//local variable
        System.out.println(str);
    }

    public static void method2(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        //instance variable ya da instance methodlar daima bir obje'ye baglidir
        C03_StaticKeyword obj1=new C03_StaticKeyword();
        obj1.instanceSayi=20;
        System.out.println(obj1.instanceSayi);//20
        obj1.method1();

        //static variable ya da static methodlar daima bir class'a baglidir
        //asıl kullanım
        C03_StaticKeyword.staticSayi=15;
        System.out.println(C03_StaticKeyword.staticSayi);
        C03_StaticKeyword.method2();

        //dolaylı kullanım
        //obj1.staticSayi=15;
        //System.out.println(obj1.staticSayi);

        System.out.println("--------------------------------------");
        C03_StaticKeyword obj2=new C03_StaticKeyword();
        //obj2.instanceSayi=20;
        System.out.println(obj2.instanceSayi);//20 Çünkü objeler içindeki değişiklik sadece o objede gecerlidir
        System.out.println(obj2.staticSayi);//15

        int toplam=0;//local variable
        toplam=obj1.instanceSayi+obj2.instanceSayi+C03_StaticKeyword.staticSayi;
        System.out.println(toplam);//


    }

}//class sonu