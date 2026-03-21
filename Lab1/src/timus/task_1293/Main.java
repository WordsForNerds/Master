package timus.task_1293;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String NabString;
        int n;
        int a;
        int b;
        int sulf;


        System.out.println("Введите три числа которые будут означать соотвественно--"
                + "Количество панелей, Длинна панели, Высота панели");
        NabString = scan.nextLine();
        //Помещаем числа, которые ввёл пользователь в массив строк
        String[] Nab = NabString.split(" ");

        //Преобразуем строки из массива Nab в числа
        n = Integer.parseInt(Nab[0]);
        a = Integer.parseInt(Nab[1]);
        b = Integer.parseInt(Nab[2]);

        //Считаем количество панелей
        sulf = a*b*2*n;

        System.out.println("Чтобы обработать все панели с двух сторон потребуется:" + " " + sulf
                + " " + "нанограмм сульфида");


    }
}
