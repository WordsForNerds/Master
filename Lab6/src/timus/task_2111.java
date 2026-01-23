package timus;

import java.util.Scanner;

public class task_2111 {

    public static void main(String[] args){

        int gruz;
        String input;
        int nalog = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите размер груза");
        gruz = scan.nextInt();
        input = scan.nextLine();

        System.out.println("Введите путь до городов через пробел");
        input = scan.nextLine();
        String[] inputAr = input.split(" ");
        int[] put = new int[inputAr.length];
        for (int i = 0; i < inputAr.length;i ++){

            put[i] = Integer.parseInt(inputAr[i]);

        }
        for (int i = 0; i < put.length;i ++){

            nalog += gruz * put[i] * 2;

        }
        System.out.println(nalog);

    }

}
