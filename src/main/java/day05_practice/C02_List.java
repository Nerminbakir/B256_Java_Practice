package day05_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_List {
    public static void main(String[] args) {

        /*
            Bir list oluşturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
            Daha sonra 10'dan buyuk olan tum elemanları 2 katına çıkarınız
        */
        //1.liste ekleme yolu
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        //2. cozum yolu
        //for (int i = 0; i < list.size(); i++) {
        //    if (list.get(i)>10){
        //        list.set(i,list.get(i)*2);
        //    }
        //}
        //System.out.println(list);




        //1. cozum yolu
        // for (int each:list
        //      ) {
        //     if (each>10){
        //         //set(index,yeni int);
        //         list.set(list.indexOf(each),each*2 );
        //     }
        // }
        // System.out.println(list);


        //2.liste ekleme yolu
        //for (int i = 1; i <=15 ; i++) {
        //    list.add(i);
        //}

        //3.liste ekleme yolu
        //list.add(1);
        //list.add(2);
        //list.add(3);...

        //4.liste ekleme yolu
        //List<Integer>list=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

    }
}