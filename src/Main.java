public class Main {
    public static void main(String[] args) {

        //Задание-1.
        System.out.println("Задание-1.");

        for (int a = 1 ; a <= 10 ; a ++)
            System.out.println(a);

        //Задание-2.
        System.out.println("Задание-2.");

        for (int b = 10 ; b >= 1 ; b --)
            System.out.println(b);

        //Задание-3.
        System.out.println("Задание-3.");

        for (int c = 0 ; c <= 17 ; c = c + 2)
            System.out.println(c);

        //Задание-4.
        System.out.println("Задание-4.");

        for (int d = 10  ; d >= -10 ; d --)
            System.out.println(d);

        //Задание-5.
        System.out.println("Задание-5.");

        for (int leapYear = 1904; leapYear <= 2096; leapYear = leapYear + 4)
            System.out.println(leapYear + " год является весокосным.");

        //Задание-6.
        System.out.println("Задание-6.");

        for (int i = 7 ; i <= 98 ; i = i + 7)
            System.out.println(i);

        //Задание-7.
        System.out.println("Задание-7.");

        for (int f = 1 ; f <= 512 ; f = f * 2)
            System.out.println(f);

        {//Задание-8.
            System.out.println("Задание-8.");

            int savings = 29_000;
            int total = 0;

            for (int g = 1; g <= 12; g++) {
                total = total + savings;
                System.out.println("Месяц " + g + ", сумма накоплений равна " + total + " рублей.");
            }
        }

        //Задание-9.
        System.out.println("Задание-9.");

        int savings = 29_000;
        int total = 0;

        for (int g = 1 ; g <= 12 ; g ++) {
            total = total + total / 100;
            total = total + savings;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + total + " рублей.");
        }
    }
}