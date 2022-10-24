public class Main {
    public static void main(String[] args) {
        int accountBalance = 2147483647;
        byte numberOfStudents = 127;
        short spareTime = -32768;
        long numberOfTasks = 922337203;
        float x = 3.4444444444444444444444444444444444444F;
        double y = 1.777777777777777777777777777777777777777777777;
        System.out.println("Значение переменной accountBalance с типом int равно " + accountBalance);
        System.out.println("Значение переменной numberOfStudents с типом byte равно " + numberOfStudents);
        System.out.println("Значение переменной spareTime с типом shor равно " + spareTime);
        System.out.println("Значение переменной numberOfTasks с типом long равно " + numberOfTasks);
        System.out.println("Значение переменной x с типом float равно " + x);
        System.out.println("Значение переменной y с типом double равно " + y);

        double a = 27.12;
       long b = 987678965549L;
       byte c = 2;
       short d = 786;
       boolean e = false;
       short f = 569;
       short g = -159;
       int h = 27897;
       byte i = 67;
        System.out.println("a:" + a + " ;b:" + b + " ;c:" + c +" ;d:" + d + " ;e:" + e + " ;f:"
                + f + " ;g:" + g + " ;h:" + h + " ;i:" + i);

        int lP = 23;
        int aC = 27;
        int eA = 30;
        int numberOfPaper = 480;
        int paperPerStudent = numberOfPaper / (lP + aC + eA);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        int numberOfBottles = 16;
        int time = 2;
        int bottlesPer20Minutes = numberOfBottles / time * 20;
        int minPerDay = 24 * 60;
        int bottlesPerDay = numberOfBottles / time * minPerDay;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 31;
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " штук");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук");
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " штук");

        byte allTins = 120;
        byte white = 2;
        byte brown = 4;
        int tinsPerClassRoom = (white + brown);
        int allClassRooms = allTins / tinsPerClassRoom;
        int whiteTins = white * allClassRooms;
        int brownTins = brown * allClassRooms;
        System.out.println("В школе, где " + allClassRooms + " классов, нужно "
                + whiteTins + " банок белой краски и " + brownTins + " банок коричневой краски");

        int grBanana = 80;
        int grMilk = 105;
        int grIceCream = 100;
        int grEgg = 70;
        int breakfast = (5 * grBanana) + (2 * grMilk) + (2 * grIceCream) + (4 * grEgg);
        double weight = breakfast / 1000.0;
        System.out.println("Вес спорт-завтрака составляет: " + weight + " кг");

        int goal = 7000;
        int losePerDay250 = 250;
        int losePerDay500 = 500;
        int daysLose250 = goal / losePerDay250;
        int daysLose500 = goal / losePerDay500;
        int gmAverageLose = (losePerDay250 + losePerDay500) / 2;
        int averageDays = goal / gmAverageLose;
        System.out.println("Если спротсмен будет терять каждый день по 250 грамм на это уёдет: "
        + daysLose250 + " дней, а если 500 грамм, уйдёт " + daysLose500 + " дней");
        System.out.println("В среднем чтобы потерять 7 кг уйдёт " + averageDays + " дней");


        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;
        double promotion = 1.1;
        double newMashaSalary = mashaSalary * promotion;
        double newDenisSalary = denisSalary * promotion;
        double newKristinaSalary = kristinaSalary * promotion;
        int year = 12;
        double mashaYearSalary = mashaSalary * year;
        double denisYearSalary = denisSalary * year;
        double kristinaYearSalary = kristinaSalary * year;
        double newMashaYearSalary = newMashaSalary * year;
        double newDenisYearSalary = newDenisSalary * year;
        double newKristinaYearSalary = newKristinaSalary * year;
        double mashaDifference = newMashaYearSalary - mashaYearSalary;
        double denisDifference = newDenisYearSalary - denisYearSalary;
        double kristinaDifference = newKristinaYearSalary - kristinaYearSalary;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на "
         + mashaDifference + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на "
                + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на "
                + kristinaDifference + " рублей");












    }
}