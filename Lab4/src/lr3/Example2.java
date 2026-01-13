package lr3;

// 2.Напишите программу, которая выводит в консольное окно прямоугольный треугольник;

public class Example2 {
    public static void main(String[] args){

        int height = 10; //Число строк, которое необходимо вывести
        int width = 1;  //Число столбцов, которое необходимо вывести для треугольника

        for (int i = 1 ; i <= height; i++){

            for ( int j = 1; j <= width; j++){

                System.out.print("0");

            }
            width++ ;
            System.out.println();

        }



    }

}

