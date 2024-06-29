package day08_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Lambda {
    public static void main(String[] args) {
        List<Integer>mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,47,58,91,37,23,8));
        ondanKucukKare(mylist);
        //3) Bir list'teki "10'dan kucuk" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
        //koyarak yazdiran method'u olusturunuz.

    }

    public static void ondanKucukKare(List<Integer> mylist) {
        mylist.stream().filter(t->t<10).map(t->t*t).forEach(System.out::println);
    }
}
