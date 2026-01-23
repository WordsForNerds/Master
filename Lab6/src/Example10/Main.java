package Example10;

//10.	Напишите программу со статическим методом,
// аргументом которому передается произвольное количество
// целочисленных аргументов. Результатом метод возвращает
// массив из двух элементов: это значения наибольшего и наименьшего
// значений среди аргументов, переданных методу.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int num;
        int[] arr = new int[2];
        //int[] array = new int[] {1,2,3,4,5};
        Scanner scan = new Scanner(System.in);
        Numtions tion = new Numtions();

        System.out.println("Введите ряд чисел через пробел");
        String inputStr = scan.nextLine();
        String[] inputAr = inputStr.split(" ");
        int[] array = new int[inputAr.length];
        for (int i = 0; i < inputAr.length;i ++){

            array[i] = Integer.parseInt(inputAr[i]);

        }

        arr = tion.function(array);

        System.out.println("Наименьшее число из списка: " + arr[0]);
        System.out.println("Набольшее число из списка: " + arr[1]);






        ;



    }


}
