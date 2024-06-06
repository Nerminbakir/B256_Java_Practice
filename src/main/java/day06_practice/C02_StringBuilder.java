package day06_practice;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C02_StringBuilder  {
    public static void main(String[] args) {

        /*

                - Ali 29.10.1923 tarihinden 45 yıl, 8 ay ve 5 gün sonra doğdu.
                - Veli 15.09.1993 tarihinden 24 yıl, 2 ay ve 11 gün önce doğdu.
                - Ali ve Veli'nin doğum tarihini hesaplayıp, yazdırınız.
                - Ali'nin doğum tarihini DD/MM/YY formatında yazdırınız.

                - Ali ve Veli'nin doğum tarhilerinin aynı olup olmadığını kontrol eden
                bir kod yazınız.

         */

        LocalDate ali=LocalDate.of(1923,10,29)
                .plusYears(45)
                .plusMonths(8)
                .plusDays(5);//plus : + demektir

        System.out.println(ali);//1969-07-04

        LocalDate veli=LocalDate.of(1993,9,15).minusYears(24)
                .minusMonths(2)
                .minusDays(11);
        System.out.println(veli);//1969-07-04

        // - Ali'nin doğum tarihini DD/MM/YY formatında yazdırınız.
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd.MMM.yyyy");//ingilizcesini bilmemiz gerekiyor
        //System.out.println(formatter.format(ali));//04.07.69
        System.out.println(ali.format(formatter));//04.07.69


        //- Ali ve Veli'nin doğum tarhilerinin aynı olup olmadığını kontrol eden kod yazınız.
        if (ali.equals(veli)) {
            System.out.println("Aynı Tarih");
        }else {
            System.out.println("Farklı Tarih");
        }

    }
}