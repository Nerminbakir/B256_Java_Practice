package day08_practice;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class C11_Lambda {
    public static void main(String[] args) {

        List<String> mylist=new ArrayList<>();
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
        yedidenAzBuyuk(mylist);
    }
    //11) Bir List'te karakter sayisi 7’den az olan tum elemanlari
    // tekrarsiz olarak console'a Buyuk harflerle yazdiran method'u olusturunuz.
    public static void yedidenAzBuyuk(List<String>mylist)
    {
        mylist.stream().distinct().filter(t->t.length()<7).map(String::toUpperCase).forEach(System.out::println);

    }
}
