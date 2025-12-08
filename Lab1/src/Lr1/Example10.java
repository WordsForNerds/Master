package Lr1;

import java.util.Scanner;

/*5. Напишите программу, в которой по году рождения определяется возраст пользователя.*/

public class Example10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int age;

        System.out.println("Введите ваш год рождения");
        age = 2025 - scan.nextInt();

        System.out.println("Ваш возраст:" + " " + age);

    }
}
