package lr4;
import java.util.Random;

//5.	Напишите программу, в которой создается двумерный целочисленный массив.
// Он заполняется случайными числами. Затем в этом массиве строки и столбцы меняются местами:
// первая строка становится первым столбцом, вторая строка становиться вторым столбцом и так далее.
// Например, если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив из 5 строк
// и 3 столбцов
public class Example5 {
    public static void main(String[] args){

        Random rnd = new Random(System.currentTimeMillis());

        int height = 3; //Число строк, которое необходимо вывести
        int width = 5;  //Число столбцов, которое необходимо вывести

        //Создаём сразу два массива, один инвертированный
        int[][] nums = new int[height][width] ;
        int[][] invertNums = new int[width][height] ;

        //Заполняем массив числами
        for(int i = 0 ; i < height; i++){

            for ( int j = 0; j < width; j++){

                nums[i][j] = 0 + rnd.nextInt(3 - 0 + 1);;

            }

        }
        //Вывожу эти числа на экран
        for(int i = 0 ; i < height; i++){

            for ( int j = 0; j < width; j++){

                System.out.print(nums[i][j]);

            }
            System.out.println();

        }

        System.out.println();

        //Переворачиваю числа из одного массива в другой
        for(int i = 0 ; i < height; i++){

            for ( int j = 0; j < width; j++){

                invertNums[j][i] = nums[i][j];

            }

        }

        for(int i = 0 ; i < width; i++){

            for ( int j = 0; j < height; j++){

                System.out.print(invertNums[i][j]);

            }
            System.out.println();

        }

    }

}
