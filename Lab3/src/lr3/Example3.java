package lr3;

/*3.	Напишите программу, которая выводит последовательность чисел Фибоначчи.
        Первые два числа в этой последовательности равны 1, а каждое следующее
        число равно сумме двух предыдущих (получается последовательность
        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел в
        последовательности вводится пользователем. Предложите версии программы,
        использующие разные операторы цикла.*/

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int numbers;
        int first = 1;
        int second = 1;
        int fib;

        System.out.println("Введите количество чисел в последовательности фибоначи");
        numbers = scan.nextInt();

        if(numbers == 1){

            System.out.println("1");
            System.exit(0);

        }
        if(numbers == 2){

            System.out.println("1 1");
            System.exit(0);

        }

        System.out.print("1" + " ");
        System.out.print("1" + " ");

        for (int i = 2; i < numbers; i++){

            fib = second + first;
            first = second;
            second = fib;

            System.out.print(fib + " ");

        }

    }

}
