package Lr1;

import java.util.Scanner;

/*8. Напишите программу для вычисления суммы двух чисел.
Оба числа вводятся пользователем. Для вычисления суммы используйте оператор +.*/

public class Example13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Введите первое число");
        num1 = scan.nextInt();

        System.out.println("Введите второе число");
        num2 = scan.nextInt();

        int num3 = num1 + num2;

        System.out.println(num3);

    }
}
