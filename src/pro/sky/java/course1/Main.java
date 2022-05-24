package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        //Задача №1
        int i = 1;
        int a = 10;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");
        }
        System.out.println();

        //Задача №2

        int friday = 6;
        for (friday = 6; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

        //Задача №3

        int currentYear = 2022;
        int yearOfComet = 0;
        for (yearOfComet = currentYear - 200; yearOfComet <= 2122; yearOfComet = yearOfComet + 1) {
            if (yearOfComet % 79 == 0) {
                System.out.println(yearOfComet);
            }
        }


    }
}
