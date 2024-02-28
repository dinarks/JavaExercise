package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println("Hello guys");
        System.out.print("hehe");
        System.out.print("hehe222");

        //for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        //  System.out.println("i = " + i);
        // }
        // Data types and variables
        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Dinar";
        char q = 'Y';
        boolean flag2 = false; //true

        //Arithmatic operation
        int result = a / b;
        int result2 = (int) (a / c); // casting karna int dibagi float
        float result3 = a / c;
        System.out.println(result);
        System.out.println(result2); // 1 int dibagi 1 float -> hierarki float lebih tinggi
        System.out.println(result3); // hasil nya dalam float (bisa desimal)

        // if, else, elseif
        int timeStart = 8;
        int timeFinish = 17;
        int waktuMasuk = 9;
        int waktuPulang = 15;

        //karyawan yang masuk tepat waktu, dan pulang tepat waktu atau lebih lama
        if (waktuMasuk <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Horeee");
            System.out.println("Congrats kamu sampai" + (timeStart - waktuMasuk) + "jam lebih cepet");
        }
        //Karyawan yang masuk tepat waktu, pulang duluan, dicengin
        else if (waktuMasuk <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("dih balik duluan");
        } else if (waktuMasuk >= timeStart && waktuPulang >= timeFinish) {
            System.out.println("dimaapin deh");
        }
        //yang telat, tapi pulang duluan
        else {
            System.out.println("dimaapin deh");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Saya WFO");
                break;
            case 2:
                System.out.println("Saya Cuti");
                break;
            case 3:
                System.out.println("Saya WFH");
                break;
            default:
                System.out.println("Saya nganggur");
                break;
        }
    }
}