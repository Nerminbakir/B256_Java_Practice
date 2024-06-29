package day08_practice;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class C10_Lambda {
    public static void main(String[] args) {
        List<String>mylist=new ArrayList<>();
        mylist.add("Bayram");
        mylist.add("Berkhan");
        mylist.add("Emine");
        mylist.add("Faruk");
        mylist.add("Feyza");
        mylist.add("Hulika");
        mylist.add("İlay");
        mylist.add("Mustafa");
        mylist.add("Levent");
        mylist.add("Kubilay");
        mylist.add("Nesibe");
        mylist.add("Ahmet");
        mylist.add("arda");
        //10) Bir List'teki A ile baslayanlar haric tum elemanlari
        //console'a yazdiran method'u olusturunuz.
        aHaric1(mylist);

    }
    public static void aHaric1(List<String>myList){
        myList.stream().filter(t->!t.toLowerCase().startsWith("a")).forEach(System.out::println);
    }
    public static void aHaric2(List<String>myList){
        myList.stream().filter((t->t.toLowerCase().charAt(0)!='a')).forEach(t -> System.out.print(t + " "));
    }
}
