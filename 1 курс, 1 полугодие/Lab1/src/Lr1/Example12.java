package Lr1;

import java.util.Scanner;

/*7. Напишите программу, в которой по возрасту определяется год рождения.*/

public class Example12 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int age;

        System.out.println("Введите ваш возраст");
        age = 2025 - scan.nextInt();

        System.out.println("Ваш год рождения:" + " " + age);

    }
}
