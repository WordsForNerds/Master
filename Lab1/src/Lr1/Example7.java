package Lr1;

import java.util.Scanner;

/*2. Напишите программу, в которой Пользователь вводит имя и возраст.
Программа отображает сообщение об имени и возрасте пользователя.*/

public class Example7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstname;
        int age;

        System.out.println("Введите имя");
        firstname = scan.nextLine();

        System.out.println("Введите возраст");
        age = scan.nextInt();

        System.out.println("Ваше имя:" + " " + firstname + "\n" + "Ваш возраст:" + " " + age);

    }
}
