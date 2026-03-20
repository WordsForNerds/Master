package lr4;
import java.util.Random;

//6.	Напишите программу, в которой создается и инициализируется двумерный числовой массив.
// Затем из этого массива удаляется строка и столбец (создается новый массив, в котором по сравнению с
// исходным удалена одна строка и один столбец). Индекс удаляемой строки и индекс удаляемого столбца
// определяется с помощью генератора случайных чисел.
public class Example6 {
    public static void main(String[] args){

        Random rnd = new Random(System.currentTimeMillis());

        int height = 5; //Число строк, которое необходимо вывести
        int width = 5;  //Число столбцов, которое необходимо вывести
        int strColomn = 0 + rnd.nextInt(3 - 0 + 1);
        int colomn = 0 + rnd.nextInt(3 - 0 + 1);

        int[][] nums = new int[height][width] ;

        //Заполняем массив
        for(int i = 0 ; i < height; i++){

            for ( int j = 0; j < width; j++){

                nums[i][j] = 6;

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

        //Удаляет одну строчку и один столбец из массива, после чего выводит
        for(int i = 0 ; i < height; i++){


            for ( int j = 0; j < width; j++){

                if (i != strColomn && j != colomn){

                    System.out.print(nums[i][j]);

                } else {

                    System.out.print(" ");

                }

            }
            System.out.println();

        }

    }

}

