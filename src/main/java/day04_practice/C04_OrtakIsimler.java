package day04_practice;

import java.util.ArrayList;
import java.util.List;

public class C04_OrtakIsimler {
    public static void main(String[] args) {
    /*
      İki Array'de ortak bulunan elementleri yazdırınız.
      (case sensitive olmadan)
      Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
      Output : {brad,sofia,emily}
     */
        String []input1={"John","Brad","Angel","Sofia","Emily"};
        String []input2={"sofia","brad","grace","emily","hazel"};
        List<String>ortakIsimler=new ArrayList<>();
        for (String each1 :input1
        ) {
            for (String each2 :input2
            ) {
                if (each2.equalsIgnoreCase(each1)){
                    ortakIsimler.add(each2);
                }
            }
        }
        System.out.println(ortakIsimler);
    }
}