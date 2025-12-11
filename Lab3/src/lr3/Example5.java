package lr3;

/*5.	Напишите программу, в которой вычисляется сумма чисел,
        удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
        или при делении на 3 в остатке получается 1. Количество чисел в сумме вводится пользователем.
        Программа отображает числа, которые суммируются, и значение суммы. Предложите версии программы,
        использующие разные операторы цикла.*/

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int numbers;
        int sum = 0;
        int num = 6;

        System.out.println("Напишите количество чисел для суммы");
        numbers = scan.nextInt();

        switch (numbers){
            case 0:
                System.out.print(0);
                System.exit(0);
            case 1:
                System.out.print(7);
                System.exit(0);
            case 2:
                System.out.print("7 + 10 = 17");
                System.exit(0);
        }

        for (int i = 0; i < numbers - 1; i++){

            if(num % 5 == 2 || num % 3 == 1){
            sum = sum + num;
            i++;
            System.out.print(num + " " + "+" + " ");
            }

         num++;
         i--;

        }
        sum = sum + num;
        System.out.print(num + " ");
        System.out.print("=" + " " + sum);

    }

}