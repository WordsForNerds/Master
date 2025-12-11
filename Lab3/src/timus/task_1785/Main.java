package timus.task_1785;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int monstr;

        System.out.println("Введите число для обозначения количества монстров");
        monstr = scan.nextInt();


        if (monstr >= 1 && monstr <= 4){

            System.out.println("few");

        }
        if (monstr >= 5 && monstr <= 9){

            System.out.println("several");

        }
        if (monstr >= 10 && monstr <= 19){

            System.out.println("pack");

        }
        if (monstr >= 20 && monstr <= 49){

            System.out.println("lots");

        }
        if (monstr >= 50 && monstr <= 99){

            System.out.println("horde");

        }
        if (monstr >= 100 && monstr <= 249){

            System.out.println("throng");

        }
        if (monstr >= 250 && monstr <= 499){

            System.out.println("swarm");

        }
        if (monstr >= 500 && monstr <= 1000){

            System.out.println("zounds");

        }
        if (monstr > 1000){

            System.out.println("legion");

        }

    }

}
