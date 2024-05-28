package day04_practice;
import java.util.Arrays;

public class C03_ArrayeElemanEkleme {
    public static void main(String[] args) {
         /*
            verilen arraye istenen bir elemanı ekleyen bir kod yazınız.
            int [] arr = {1,4,7,11};
            eklenecek eleman = 5;
         */
        int [] arr = {1,4,7,11};
        System.out.println(Arrays.toString(arr));//[1, 4, 7, 11]
        int []yeniArr=new int[arr.length+1];
        System.out.println(Arrays.toString(yeniArr));//[0, 0, 0, 0, 0]
        int sayac=0;
        for (int each:arr) {
            yeniArr[sayac]=each;
            sayac++;
        }

        // for (int i = 0; i <arr.length ; i++) {
        //     yeniArr[i]=arr[i];
        // }

        yeniArr[yeniArr.length-1]=5;
        // Arrays.sort(yeniArr);
        System.out.println(Arrays.toString(yeniArr));

    }
}