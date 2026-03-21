package timus;

import java.util.Scanner;

public class task_1044 {

    public static void main(String[] args){

        int count;
        int counter = 0;
        int max;
        int num1 = 0;
        int num2 = 0;
        int firstInt;
        int secondInt;
        String first;
        String second;
        String str = "9";
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите чётное количество символов в билете");
        count = scan.nextInt();

        for(int i = 1; i < count; i++){

            str = str + "9";

        }
        max = Integer.parseInt(str);

        for(int i = 0; i <= max; i++){

            if(Integer.toString(i).length()%2 == 0){

                first = Integer.toString(i).substring(0,Integer.toString(i).length()/2);
                second = Integer.toString(i).substring(Integer.toString(i).length()/2);
                firstInt = Integer.parseInt(first);
                secondInt = Integer.parseInt(second);

                while(firstInt != 0){

                    num1 += firstInt%10;
                    firstInt = firstInt/10;

                }
                while(secondInt != 0){

                    num2 += secondInt%10;
                    secondInt = secondInt/10;

                }
                if (num1 == num2){

                    counter++;
                }

                num1 = 0;
                num2 = 0;


            } else {


            }


        }
        System.out.println(counter + 1);


    }



}
