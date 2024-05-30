package day05_practice;

public class C05_Varargs {
    public static void main(String[] args) {

        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olani yazdiran bir method olusturun
        String str1 = "Ali";
        String str2 = "Ridvan";
        String str3 = "Aysel";
        String str4 = "Kerem";
        String str5 = "Mustafa";
        String str6 = "Mehmet";
        String str7 = "ErkanCeviz";

        enUzunKelimeYazdir(str1, str2, str3, str4, str5, str6, str7);

    }//main sonu

    private static void enUzunKelimeYazdir(String...kelimeler) {
        //bir methodda yalniz 1 tane varargs bulunur ve parametreler arasında sona yazılması gerekir
        String enUzunKelime="";
        for (String kelime:kelimeler
        ) {
            if (enUzunKelime.length()<kelime.length()){
                enUzunKelime=kelime;
            }
        }

        System.out.println(enUzunKelime);
    }
}
