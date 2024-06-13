package day07_practice.inheritance01;

public class Child extends Parent{

    public int yas=5;

    @Override
    protected void method4() {
        System.out.println("Child method4 yas : "+this.yas);
    }

    public static void main(String[] args) {

        System.out.println(Parent.isim);
        System.out.println(isim);

        Parent.method1();
        method1();


        Parent p=new Parent();
        System.out.println(p.yas);//30

        Child c=new Child();
        System.out.println(c.yas);//30


        Parent parent=new Child();
        System.out.println(parent.yas);

        parent.method3();//parent
        parent.method4();//child

        c.method4();

    }

}
