package Lr1;

import java.util.Scanner;

/*6. Напишите программу, в которой Пользователь вводит имя и год рождения,
в программа отображает сообщение содержащее имя пользователя и его возраст.*/

public class Example11 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

    String name;
    int age;

        System.out.println("Введите ваше имя");
        name = scan.nextLine();

        System.out.println("Введите ваш год рождения");
        age = 2025 - scan.nextInt();

        System.out.println("Ваше имя и возраст:" + " " + name + " " + age);

    }
}
