package Example6;

import java.util.Scanner;

//6. Напишите программу с классом, в котором есть два закрытых
// целочисленных поля (назовем их max и min). Значение поля max
// не может быть меньше значения поля min. Значения полям присваиваются
// с помощью открытого метода. Метод может вызываться с одним или двумя
// целочисленными аргументами. При вызове метода значения полям присваиваются так
// : сравниваются текущие значения полей и значения аргументов, переданных методу.
// Самое большое из значений присваивается полю max, а самое маленькое из значений
// присваивается полю min. Предусмотрите конструктор, который работает по тому же принципу,
// что и метод для присваивания значений полям. В классе также должен быть метод, отображающий
// в консольном окне значения полей объекта.

public class Main {

    public static void main(String[] args){

        int choice;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа ");
        NumberClass function = new NumberClass(scan.nextInt(),scan.nextInt());
        while(1>0){

            System.out.println("Введите 1, если хотите дописать ещё одно число");
            System.out.println("Введите 2, если хотите дописать ещё два числа");
            System.out.println("Введите 3, если хотите посмотреть на результат");
            System.out.println(" ");

            choice = scan.nextInt();

            if(choice == 1){
                System.out.println("Введите число");
                function.set(scan.nextInt());

            }
            if(choice == 2){
                System.out.println("Введите числа");
                function.set(scan.nextInt(), scan.nextInt());

            }

            if(choice == 3){

                function.out();
                return;
            }
        }


    }

}
