package Lr1;

import java.util.Scanner;

/*4. Напишите программу, в которой пользователю предлагается ввести название месяца и количество дней в этом месяце.
Программа выводит сообщение о том, что соответствующий месяц содержит указанное количество дней.*/

public class Example9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String month;
        String days;

        System.out.println("Введите название месяца");
        month = scan.nextLine();

        System.out.println("Введите день месяца");
        days = scan.nextLine();

        System.out.println(month + " " + "содержит" + " " + days + " " + "день");

    }
}
