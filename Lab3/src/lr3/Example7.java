package lr3;

/*7.	Напишите программу, в которой создается одномерный символьный массив из 10 элементов.
        Массив заполняется буквами «через одну», начиная с буквы ' а ': то есть массив заполняется буквами
        'а', 'с', ' е', 'д' и так далее. Отобразите массив в консольном окне в прямом и обратном порядке.
        Размер массива задается переменной.*/

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] letters = {"a","c","e","g","i","k","m","o","q","s"};
        int range;

        System.out.println("Введите цифру от 1 до 10");
        range = scan.nextInt();

        System.out.print("[");
        for(int i = 0; i < range; i ++){

            if (i < range -1){

                System.out.print(letters[i] + " " + "," + " ");

            } else {

                System.out.println(letters[i] + "]");

            }

        }

        System.out.print("[");
        for(int i = 9; i > 9 - range; i --){

            if (i > 9 - range + 1 ){

                System.out.print(letters[i] + " " + "," + " ");

            } else {

                System.out.print(letters[i] + "]");

            }

        }


    }

}