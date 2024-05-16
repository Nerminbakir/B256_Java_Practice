package day03_practice;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        //1. yol
        //System.out.println("*\n" +
        //                   "* *\n" +
        //                   "* * *\n" +
        //                   "* * * *\n" +
        //                   "* * * * *\n" +
        //                   "* * * *\n" +
        //                   "* * *\n" +
        //                   "* *\n" +
        //                   "*");


        //2. yol


        for (int satir = 1; satir <=5 ; satir++) {
            for (int sutun = 1; sutun <=satir ; sutun++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int satir = 4; satir >=1 ; satir--) {
            for (int sutun = 1; sutun <=satir ; sutun++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
