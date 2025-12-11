package lr3;

/*4.	Напишите программу, в которой пользователем вводится два целых числа.
        Программа выводит все целые числа — начиная с наименьшего (из двух введенных чисел)
        и заканчивая наибольшим (из двух введенных чисел). Предложите разные версии программы
        (с использованием разных операторов цикла).*/

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.println("Введите число A");
        a = scan.nextInt();

        System.out.println("Введите число B");
        b = scan.nextInt();

        if (b < a){

            c = b;
            b = a;
            a = c;

        }

        for ( int i = a ; i <= b ; i++){

            System.out.print(i + " ");

        }

    }

}