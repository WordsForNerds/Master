package timus.task_1264;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n;
        int m;
        int sec;

        System.out.println("Введите число N");
        n = scan.nextInt();

        System.out.println("Введите число M");
        m = scan.nextInt();

        sec = n * (m + 1);

        System.out.println(sec);

    }

}
