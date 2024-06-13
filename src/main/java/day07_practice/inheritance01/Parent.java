package day07_practice.inheritance01;

/*
            1 - Variable/Field
            2 - Constructor
            3 - Method (Opsiyonel)
            4 - Getter & Setter
            5 - toString (Opsiyonel)
         */
        /*
            - isim ve soyisim static değişkenleri oluşturalım.
            - method1 ve method2 static method'ları oluşturalım.
            - yas isimli bir instance variable oluşturalım.
            - method3 ve method4 isimli instance method'lar oluşturalım.
            - Oluşturduğumuz değişken ve method'ları, Child class'tan inheritance yaparak çağıralım.
        */


public class Parent {

    //- isim ve soyisim static değişkenleri oluşturalım.
    protected static String isim="Ali";

    protected static String soyisim="Can";

//- method1 ve method2 static method'ları oluşturalım.

    protected static void method1(){
        System.out.println("Parent class static method1");
    }

    protected static void method2(){
        System.out.println("Parent class static method2");
    }

    //- yas isimli bir instance variable oluşturalım.
    protected int yas=30;

    //default:paramsiz const
    public Parent(){

    }

    //paramli const
    public Parent(int age){
        this.yas=age;
    }

    // - method3 ve method4 isimli instance method'lar oluşturalım.

    protected void method3(){
        System.out.println("Parent classın intance method3 yas : "+this.yas);
    }

    protected void method4(){
        System.out.println("Parent classın intance method4 yas : "+this.yas);
    }

}


