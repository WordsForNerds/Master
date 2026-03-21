package lr3;

/*6.	Напишите программу, в которой создается одномерный числовой массив и заполняется числами,
        которые при делении на 5 дают в остатке 2 (числа 2, 7,12,17 и так далее). Размер массива
        вводится пользователем. Предусмотреть обработку ошибки, связанной с вводом некорректного значения.*/

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int count;
        int num = 6;

        System.out.println("Введите количество символов в массиве");
        count = scan.nextInt();

        int[] arr = new int[count];

        System.out.print("[" + " ");

        for(int i = 0; i < count ;){

            if (num % 5 == 2){

            arr[i] = num;
            if (i == count - 1){

                System.out.print(arr[i] + " " + "]");
                return;
            }
            System.out.print(arr[i] + "," + " ");
            i++;

            }

            num++;

        }

    }

}