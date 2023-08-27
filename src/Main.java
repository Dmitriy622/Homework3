public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int i = 70000;
        byte b = 123;
        short s = 22000;
        long l = 3700000000L;
        float f = 15.123F;
        double d = 94.123456789;
        System.out.println("Значение переменной i с типом int равно " +i);
        System.out.println("Значение переменной b с типом byte равно " +b);
        System.out.println("Значение переменной s с типом short равно " +s);
        System.out.println("Значение переменной l с типом long равно " +l);
        System.out.println("Значение переменной f с типом float равно " +f);
        System.out.println("Значение переменной d с типом double равно " +d);

        System.out.println("Задание 2");
        float f1 = 27.12F;
        long l2 = 987678965549L;
        float f3 = 2.786F;
        short s2 = 569;
        short s3 = -159;
        short s4 = 27897;
        byte b2 = 67;

        System.out.println("Задание 3");
        int allStudents = 23 + 27 + 30;
        int paperForOneStudent = 480 / allStudents;
        System.out.println("На каждого ученика рассчитано " +paperForOneStudent +" листов бумаги");

        System.out.println("Задание 4");
        byte time2Min = 16;
        short time20Min = (short) ((time2Min / 2) * 20);
        short time24H = (short) (time20Min * 3 * 24);
        int time3Day = time24H * 3;
        int month = time24H * 30;
        System.out.println("За 20 минут машина произвела " +time20Min +" штук бутылок");
        System.out.println("За сутки машина произвела " +time24H +" штук бутылок");
        System.out.println("За три дня машина произвела " +time3Day +" штук бутылок");
        System.out.println("За месяц машина произвела " +month +" штук бутылок");

        System.out.println("Задание 5");
        byte allPaint = 120;
        byte whiteColourOR = 2;
        byte brownColourOR = 4;
        int oneRoomPaint = whiteColourOR + brownColourOR;
        int rooms = allPaint / oneRoomPaint;
        int whiteColourAll = whiteColourOR * rooms;
        int brownColourAll = brownColourOR * rooms;
        System.out.println("В школе, где " +rooms +" классов, нужно " +whiteColourAll +" банок белой краски и " +brownColourAll +" банок коричневой краски");

        System.out.println("Задание 6");
        short bananas = (short) 5 * 80;
        short milk = (short) 200 / 100 * 105;
        short iceCream = (short) 2 * 100;
        short eggs = (short) 4 * 70;
        int gr = bananas + milk + iceCream + eggs;
        System.out.println("Завтрак спортсмена в граммах равен " +gr);
        float kg = gr / 1000F;
        System.out.println("Завтрак спортсмена в килограммах равен " +kg);

        System.out.println("Задание 7");
        byte allKg = 7;
        int allGr = allKg * 1000;
        short oneQuarter = 250;
        short twoQuarter = 500;
        int day1 = allGr / oneQuarter;
        int day2 = allGr / twoQuarter;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то ему понадобится - " +day1 + " дней ,а если по 500 грамм в день, то - " +day2 +" дней");

        System.out.println("Задание 8");
        int mashaOldS = 67760;
        int denisOldS = 83690;
        int kristinaOldS = 76230;
        float coeff = 1.1f;
        double mashaNewS = mashaOldS * coeff;
        double denisNewS = denisOldS * coeff;
        double kristinaNewS = kristinaOldS * coeff;
        double annualDifferenceMasha = (mashaNewS - mashaOldS) * 12;
        double annualDifferenceDenis = (denisNewS - denisOldS) * 12;
        double annualDifferenceKristina = (kristinaNewS - kristinaOldS) * 12;
        System.out.println("Маша теперь получает " +mashaNewS +" рублей. Годовой доход вырос на " +annualDifferenceMasha +" рублей");
        System.out.println("Денис теперь получает " +denisNewS +" рублей. Годовой доход вырос на " +annualDifferenceDenis +" рублей");
        System.out.println("Кристина теперь получает " +kristinaNewS +" рублей. Годовой доход вырос на " +annualDifferenceKristina +" рублей");
    }
}