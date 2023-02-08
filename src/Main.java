public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cometFlight = 79;
        int yearCount = 0;
        int nowYears = 2023;
        int startYear = nowYears - 200;
        int endYear = nowYears + 100;
        while (yearCount <= endYear) {
            if ((yearCount>= startYear) && (yearCount % cometFlight == 0)) {
                System.out.println(yearCount);
            }
            yearCount++;
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int numberFriday = 5;
        int daysCount = 1;
        while (daysCount <= 31) {
            if (daysCount == numberFriday || daysCount % 7 == numberFriday) {
                System.out.println("Сегодня пятница, " + daysCount + "-е число. Необходимо подготовить отчет");
            }
            daysCount++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int monthCount = 0;
        while (monthCount < 108) {
            monthCount++;
            deposit = deposit / 100 * 7 + deposit;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + deposit);
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int monthCount = 0;
        while (deposit <= 12_000_000) {
            monthCount++;
            deposit = deposit / 100 * 7 + deposit;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + deposit);
            }
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int deposit = 15000;
        int monthCount = 0;
        while (deposit <= 12_000_000) {
            monthCount++;
            deposit = deposit / 100 * 7 + deposit;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + deposit);
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = population / 1000 * 17;
        int mortalityRate = population / 1000 * 8;
        int i = 1;
        while (i <= 10) {
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
            i++;
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int i = 1;
        for (; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        while (i > 1) {
            i--;
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int monthMoney = 15000;
        int sumMoney = 0;
        int monthCount = 0;
        while (sumMoney <= 2_459_000) {
            monthCount++;
            sumMoney = sumMoney + monthMoney;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + sumMoney + " рублей");
        }
    }
}