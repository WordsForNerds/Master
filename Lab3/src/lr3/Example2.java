package lr3;

/*2.	Напишите программу, в которой пользователю предлагается ввести название дня недели.
        По введенному названию программа определяет порядковый номер дня в неделе.
        Если пользователь вводит неправильное название дня, программа выводит сообщение о том,
        что такого дня нет. Предложите версию программы на основе вложенных условных операторов и на
        основе оператора выбора switch.*/

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String day;

         System.out.println("Введите день недели с большой буквы");
         day = scan.nextLine();

         switch (day){

             case "Понедельник":
                 System.out.println("Цифра вашего дня недели" + " " + "1");
                 break;

             case "Вторник":
                 System.out.println("Цифра вашего дня недели" + " " + "2");
                 break;
             case "Среда":
                 System.out.println("Цифра вашего дня недели" + " " + "3");
                 break;
             case "Четверг":
                 System.out.println("Цифра вашего дня недели" + " " + "4");
                 break;
             case "Пятница":
                 System.out.println("Цифра вашего дня недели" + " " + "5");
                 break;
             case "Суббота":
                 System.out.println("Цифра вашего дня недели" + " " + "6");
                 break;
             case "Воскресенье":
                 System.out.println("Цифра вашего дня недели" + " " + "7");
                 break;
             default:
                 System.out.println("Такого дня недели не существует");
         }

        }

    }