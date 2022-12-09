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

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total += salary;
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        int j = 10;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        float birthRate = 0.017f;
        float deathRate = 0.008f;
        float averageRate = birthRate - deathRate;
        for (int i = 1; i <= 10; i++) {
            population += population * averageRate;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int total = 15_000;
        float interestRate = 0.07f;
        int month = 0;
        while (total < 12_000_000) {
            total += total * interestRate;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений " + total);

        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 15_000;
        float interestRate = 0.07f;
        int month = 0;
        while (total < 12_000_000) {
            total += total * interestRate;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 15_000;
        float interestRate = 0.07f;
        int month = 0;
        while (month <= 108) {
            total += total * interestRate;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 2;
        for (int day = 1; day <= 31; day++) {
            if (day == firstFriday || ((day - firstFriday) % 7 == 0)) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо готовить отчет");
            }

        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearBefore = 2022 - 200;
        int yearAfter = 2022 + 100;
        int year = yearBefore;
        while (year <= yearAfter) {
            if ((year - yearBefore)%79 == 0){
                System.out.println(year);
            }
            year++;
        }
    }
}