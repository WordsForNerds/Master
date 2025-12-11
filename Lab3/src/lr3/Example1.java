package lr3;

/*1.	Напишите программу, в которой пользователь вводит целое число в диапазоне от 1 до 7,
        а программа определяет по этому числу день недели. Если введенное пользователем
        число выходит за допустимый диапазон, выводится сообщение о том, что введено некорректное значение.
        Используйте оператор выбора switch.*/

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Введите число в диапазоне от 1 до 7");
        num = scan.nextInt();

        if (num > 1 || num > 7){

            System.out.println("Введённое число выходить за допустимый диапазон");

        }

        switch (num){

            case 1:
                System.out.println("Сегодняший день недели это понедельник");
                break;

            case 2:
                System.out.println("Сегодняший день недели это вторник");
                break;

            case 3:
                System.out.println("Сегодняший день недели это среда");
                break;

            case 4:
                System.out.println("Сегодняший день недели это четверг");
                break;

            case 5:
                System.out.println("Сегодняший день недели это пятница");
                break;

            case 6:
                System.out.println("Сегодняший день недели это суббота");
                break;

            case 7:
                System.out.println("Сегодняший день недели это воскресенье");
                break;

        }

    }

}
