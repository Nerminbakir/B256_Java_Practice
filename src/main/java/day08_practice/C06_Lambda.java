package day08_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,9,47,58,91,37,37,23,8,11,1,23,23,8));
        uceBolunenlerinKupToplami(mylist);
        /*
       6)bir listedeki elemanlardan 3'e bolunenlerin ilk once kupunu alıp sonra bunlarin toplamını bulan bir method olusturun
       */
    }
    public static void uceBolunenlerinKupToplami(List<Integer>mylist){
        double toplam=mylist.stream().filter(t->t%3==0).map(t->Math.pow(t,3)).reduce(0.0,Double::sum);
        System.out.println("toplam = " + toplam);
    }

}
