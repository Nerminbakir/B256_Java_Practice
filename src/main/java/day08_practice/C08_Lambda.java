package day08_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_Lambda {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,9,47,58,91,37,37,23,8,11,1,23,23,8));
        maksimum(mylist);
        //8)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
        int max=mylist.get(0);
        for (int a:mylist
        ) {
            if (max>a){

            }else {
                max=a;
            }
        }
        System.out.println("max = " + max);
    }
    public static void maksimum(List<Integer>mylist){
        int max=mylist.stream().distinct().reduce(Math::max).get();
        System.out.println("Method icindeki max = " + max);

    }
}
