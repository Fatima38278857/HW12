package Skypro.Year;

import java.util.Scanner;

public class Year {


      // Задание 1
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int year1;
          do {
              System.out.print("Укажите интересующий вас год - ");
              int year = in.nextInt();
              checkYear(year);
              System.out.print("Желаете проверить ещё раз 'год': Да (1); Нет(0) - ");
              year1 = in.nextInt();
          } while (year1 == 1);


      }

    public static void checkYear(int year) { // Метод

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) { // Задание с висакосным годом
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
    }

    // Задание 2

}






