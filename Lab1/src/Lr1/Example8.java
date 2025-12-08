package Lr1;

import java.util.Scanner;

/*3. Напишите программу, в которой Пользователь последовательно вводит название текущего дня недели,
название месяца и дату (номер дня в месяце). Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).*/

public class Example8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String day;
        String month;
        String date;

        System.out.println("Введите день недели");
        day = scan.nextLine();

        System.out.println("Введите месяц");
        month = scan.nextLine();
        month = month.substring(0, month.length() - 1);

        System.out.println("Введите дату");
        date = scan.nextLine();



        System.out.println("Сегодняшнаяя дата:" + " " + day + " " + date + " " + month + "я" );

    }
}