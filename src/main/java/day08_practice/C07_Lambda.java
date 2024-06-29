package day08_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_Lambda {
    public static void main(String[] args) {
        List<Integer>myList=new ArrayList<>(Arrays.asList(4,8,16,64));
      /*
    7)bir listedeki tekrarsiz elemanlardan 4'e tam bolunenlerin karekoklerinin carpimini yazdirin
     */
        dordeTamBolunenKarekokCarpimi(myList);


    }
    public static void dordeTamBolunenKarekokCarpimi(List<Integer> myList) {
        double carpim= myList.stream().distinct().filter(t->t%4==0).map(Math::sqrt).reduce(1.0,(t,u)->t*u);
        System.out.println("carpim = " + String.format("%.2f",carpim));
    }
}
