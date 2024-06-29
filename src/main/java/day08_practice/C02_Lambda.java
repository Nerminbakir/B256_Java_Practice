package day08_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
        beseBolunen(mylist);
        //2) bir listedeki elemanlardan 5'e tam bolunenleri yazdiran bir method olusturun
    }
    public static void beseBolunen(List<Integer>mylist){
        mylist.stream().filter(t->t%5==0).forEach(System.out::println);
    }
}
