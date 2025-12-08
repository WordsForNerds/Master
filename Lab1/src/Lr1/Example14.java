package Lr1;

import java.util.Scanner;

/*9. Напишите программу, в которой пользователь вводит число, а программой отображается последовательность из четырех чисел:
число, на единицу меньше введённого, введенное число и число, на единицу больше введенного. Четвертое число должно
быть квадратом суммы первых трех чисел.*/

public class Example14 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int number4;

        System.out.println("Введите любое число");
        number2 = scan.nextInt();
        number1 = number2 - 1;
        number3 = number2 + 1;
        number4 = (number1 + number2 + number3) * (number1 + number2 + number3);

        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);

    }
}
