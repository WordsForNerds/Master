package lr3;

//1.Напишите программу, которая  строк;выводить в консольное окно прямоугольник,
// размеры сторон которого, ширина: 23 колонки, высота: 11
public class Example1 {
    public static void main(String[] args){

        int height = 11; //Число строк, которое необходимо вывести
        int width = 23;  //Число столбцов, которое необходимо вывести

        for (int i = 1 ; i <= height; i++){

            for ( int j = 1; j <= width; j++){

                System.out.print("0");

            }

            System.out.println();

        }



    }

}
