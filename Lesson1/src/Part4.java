public class Part4 {
    public static void main(String[] args) {

        String model = "Lenovo 82NW";

        float bios = 3.3f;
        byte cpuCount = 8;
        int cpuThread = 16;
        short mem = 16000;
        long hddSize = 49964785664L;

        boolean pcWorking = true;
        double virtMem = 41.9;
        char letterP ='P';

        System.out.println("Задача_№1");
        System.out.println(letterP + " -  " +   "Модель ноутбука - " + model + "\n" +
                "Процессор состоящий из " + cpuCount + " ядер" + "\n" +
                "и " + cpuThread + " потоков" + "\n" +
                "имеющий оперативную память - " + mem + " Гб" + "\n" +
                "имеющий виртуальную память - " + virtMem + " Гб" + "\n" +
                "объем SSD_M2 - " + hddSize + " байт" + "\n" +
                "компьютер исправен и работает   -" + pcWorking);

        int pencil = 100;
        int book = 200;

        int discountPercent = 11;

        int sumFull = pencil + book;
        int discount = (sumFull*discountPercent)/100;

        int sumFinal = sumFull - discount;

        System.out.println();
        System.out.println("Задача_№2");
        System.out.println("Общая стоимость товаров без скидки -  " + sumFull);
        System.out.println("Сумма скидки - " + discount);
        System.out.println("Общая стоимость товаров со скидкой -  " + sumFinal);

        System.out.println();
        System.out.println("Задача_№3");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println();
        System.out.println("Задача_№4");

        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807L;

        byte a1 = (byte)(a + 1);
        byte a2 = (byte)(a - 1);


        System.out.println("a = " + a);
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println();



        short b1 = (short)(b + 1);
        short b2 = (short)(b - 1);

        System.out.println("b = " + b);
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println();


        int c1 = (int)(c + 1);
        int c2 = (int)(c - 1);

        System.out.println("c = " + c);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println();


        long d1 = (long)(d + 1);
        long d2 = (long)(d - 1);

        System.out.println("d = " + d);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        System.out.println();
        System.out.println("Задача_№5");

        int a5 = 2;
        int b5 = 8;

        int c5 = 3;

        c5 = a5;
        a5 = b5;
        b5 = c5;

        System.out.println("с помощью третьей переменной");
        System.out.println("a5 = " + a5);
        System.out.println("b5 = " + b5);
        System.out.println();

        int a6 = 2;
        int b6 = 8;

        a6 = a6 + b6 ;
        b6 = a6 - b6;
        a6 = a6 - b6;

        System.out.println("с помощью арифметических операций");
        System.out.println("a6 = " + a6);
        System.out.println("b6 = " + b6);
        System.out.println();


        int a7 = 2;
        int b7 = 8;

        a7 = a7^b7 ;
        b7 = a7^b7;
        a7 = a7^b7;

        System.out.println("с помощью побитовой операции ^");
        System.out.println("a7 = " + a7);
        System.out.println("b7 = " + b7);
        System.out.println();

        System.out.println();
        System.out.println("Задача_№6");


        char char1 = 35;
        char char2 = 38;
        char char3 = 64;
        char char4 = 94;
        char char5 = 95;

        System.out.println("char1 - " + char1);
        System.out.println("char2 - " + char2);
        System.out.println("char3 - " + char3);
        System.out.println("char4 - " + char4);
        System.out.println("char5 - " + char5);
        System.out.println();


        System.out.println("код символа - " + (int)char1 + ", "+"сам символ - " + char1);
        System.out.println("код символа - " + (int)char2 + ", "+"сам символ - " + char2);
        System.out.println("код символа - " + (int)char3 + ", "+"сам символ - " + char3);
        System.out.println("код символа - " + (int)char4 + ", "+"сам символ - " + char4);
        System.out.println("код символа - " + (int)char5 + ", "+"сам символ - " + char5);
        System.out.println();

        System.out.println("Задача_№7");
        System.out.println();

        char char11 = '/'; //  - /     (косая черта слево - направо)
        char char12 = '\\'; //  - \     (косая черта справо - налево)
        char char13 = '_'; //  - _     (нижнее подчеркивание)
        char char14 = '('; //  - (     (левая скобка)
        char char15 = ')'; //  - )     (правая скобка)


        System.out.println("    " + char11 + "" + char12 + "    ");
        System.out.println("   " + char11 + "  " + char12);
        System.out.println("  " + char11 + "" + char13 +"" + char14 + " " + char15 + "" + "" + char12);
        System.out.println(" " + char11 + "" + "      " + char12 );
        System.out.println("" + char11 + "" + char13 +""+ char13 +""+ char13 +""+ char13+ ""+ char11+ "" + char12+ "" + char13 +""+ char13 +"" + char12 );
        System.out.println();

        System.out.println("Задача_№8");
        System.out.println();

        int x = 123;
        int hundreds = x/100; // сотни
        int tens = (x/10)%10;  // десятки
        int units = x%10;  // единицы

        System.out.println("Сотен в числе - " + hundreds);
        System.out.println("Десяток в числе - " + tens);
        System.out.println("Единиц в числе - " + units);
        System.out.println();

        System.out.println("Произведение чисел равно - " + hundreds*tens*units);
        System.out.println("Сумма чисел равна - " + (hundreds+tens+units));
        System.out.println();

        System.out.println("Задача_№9");
        System.out.println();

        int x1 = 86399;

        int secHour = 3600;
        int secMin = 60;

        int hour = x1/secHour;
        int min = (x1 - hour*secHour)/secMin;
        int sec = x1 - hour*secHour - min*secHour/secMin;

        System.out.println("hour " + hour);
        System.out.println("min " + min);
        System.out.println("sec "  + sec);
        System.out.println();

        System.out.println("итоговое время - "+ hour + ":" + min + ":" + sec);

    }


}



