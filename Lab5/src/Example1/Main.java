package Example1;

import java.util.Scanner;

//1. Напишите программу с классом, в котором есть закрытое символьное поле
// и три открытых метода. Один из методов позволяет присвоить значение полю.
// Еще один метод при вызове возвращает результатом код символа.
// Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.

public class Main {

    public static void main(String[] args){

     //Создаю объекты новых классов
     Scanner scan = new Scanner(System.in);
     NumberClass function = new NumberClass();

     //Сохраняем число в объект
     System.out.println("Введите число, которое хотите сохранить");
     function.setValues(scan.nextInt());

     //Выводим число используя метод класса
     function.out();

    }

}
