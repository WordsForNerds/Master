package Example5;

//5.	Напишите программу со статическим методом, которым вычисляется сумма квадратов натуральных чисел
// 12 + 22 + 32 + ... + п2. Число п передается аргументом методу. Для проверки результата можно использовать
// формулу 12 + 22 +32+…+n2=(n+l) (2n + 1)/6

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Numtions tion = new Numtions();

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число для подсчёта суммы его натуральных чисел:");
        tion.function(scan.nextInt());


    }
}
