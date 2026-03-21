package Example2;

//2.	Напишите программу с классом, в котором есть закрытое статическое целочисленное ноле
// с начальным нулевым значением. В классе должен быть описан статический метод, при вызове
// которого отображается текущее значение статического поля, после чего значение поля увеличивается
// на единицу.

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    Numtions tion = new Numtions();

    int choice;

        while(true){

            System.out.println("Хотите вывести содержимое поля ?");
            System.out.println("Введите 1, если да");
            System.out.println("Введите 2, если нет");
            choice = scan.nextInt();

            if(choice == 1){

                tion.out();

            } else {

                return;

            }

        }

    }
}
