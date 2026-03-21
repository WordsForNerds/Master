package Lr1;

import java.util.Scanner;

/*1. Напишите программу, в которой Пользователь вводит сначала фамилию, затем имя, затем отчество.
После ввода программа выводит сообщение «Hello <фамилия, имя, отчество>».*/

public class Example6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String lastname;
        String firstname;
        String middlename;

        System.out.println("Введите фамилию");
        lastname = scan.nextLine();

        System.out.println("Введите имя");
        firstname = scan.nextLine();

        System.out.println("Введите отчество");
        middlename = scan.nextLine();

        System.out.println("Hello" + " " + lastname + " " + firstname + " " + middlename);

    }
}
