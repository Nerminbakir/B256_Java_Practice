package day05_practice;

import java.util.Arrays;
public class C01_MDA {
    public static void main(String[] args) {

        /*
             mdarray oluşturun yazdırın
             daha sonra bu mda ' yi, her bir elemanı iç array elemanlarının toplamına eşit olan tek boyutlu
             bir array haline getirin
             ör --> int [] [] arr={{3,4},{1,2},{8,7}} --------> {7,3,15}
        */
        int [][] arr={{3,4},{1,2},{8,7}};
        // System.out.println(arr[0][0]);//3
        // System.out.println(Arrays.toString(arr[2]));
        // System.out.println(Arrays.deepToString(arr));
        int []yeniArr=new int[arr.length];
        int toplam=0;
        //int idx=0;
        //2. yol
        for (int i = 0; i <arr.length ; i++) {
            for (int each2 : arr[i]
            ) {
                toplam += each2;//toplam=toplam+each2;
            }
            yeniArr[i] = toplam;
            toplam = 0;
        }
        System.out.println(Arrays.toString(yeniArr));

        //1.yol
        //for (int []each:arr
        //) {
        //    for (int each2:each
        //    ) {
        //        toplam+=each2;//toplam=toplam+each2;
        //    }
        //    yeniArr[idx]=toplam;
        //    idx++;
        //    toplam=0;
        //}

    }
}