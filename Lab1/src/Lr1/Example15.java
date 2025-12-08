package Lr1;

import java.util.Scanner;

/*10. Напишите программу, в которой
Пользователь вводит два числа, а программой вычисляется и отображается сумма и разность этих чисел.*/

public class Example15 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Введите первое число");
        num1 = scan.nextInt();

        System.out.println("Введите второе число");
        num2 = scan.nextInt();

        int sum = num1 + num2;
        int rasn = num1 - num2;

        System.out.println("Сумма чисел:" + " " + sum + "\n" + "Разность чисел:" + " " + rasn );

    }
}
