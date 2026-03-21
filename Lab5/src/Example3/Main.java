package Example3;

import java.util.Scanner;
//3. Напишите программу с классом, у которого есть два целочисленных поля.
// В классе должны быть описаны конструкторы, позволяющие создавать объекты
// без передачи аргументов, с передачей одного аргумента и с передачей двух аргументов.

public class Main {

    public static void main(String[] args){

        int num1;
        int num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два ваших числа");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        NumberClass.NumberClassOne function1 = new NumberClass.NumberClassOne();
        NumberClass.NumberClassTwo function2 = new NumberClass.NumberClassTwo(num1);
        NumberClass.NumberClassThree function3 = new NumberClass.NumberClassThree(num1,num2);


    }

}
