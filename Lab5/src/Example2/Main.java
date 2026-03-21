package Example2;

import java.util.Scanner;
//2. Напишите программу с классом, у которого есть два символьных поля и метод.
// Он возвращает результат, и у него нет аргументов. При вызове метод выводит в
// консольное окно все символы из кодовой таблицы, которые находятся «между» символами,
// являющимися значениями полей объекта (из которого вызывается метод).
// Например, если полям объекта присвоены значения ‘A’ и ‘D’, то
// при вызове метода в консольное окно должны выводиться все символы от ‘A’ до ‘D’ включительно.

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        NumberClass function = new NumberClass();

        System.out.println("Введите два ваших числа");
        function.setValues(scan.nextInt(), scan.nextInt());

        function.out();


    }

}
