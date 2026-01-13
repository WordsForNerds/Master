package lr3;

//4.Напишите программу, в которой создается двумерный массив,
// который выводит прямоугольный треугольник;
public class Example4 {
    public static void main(String[] args){

        int height = 10; //Число строк, которое необходимо вывести
        int width = 10;  //Число столбцов, которое необходимо вывести

        int[][] nums = new int[height][width] ;

        //Заполняем массив двойками
        for(int i = 0 ; i < height; i++){

            for ( int j = 0; j < width; j++){

                nums[i][j] = 2;

            }

        }

        width = 0;

        for(int i = 0 ; i < height; i++){

            for ( int j = 0; j < width; j++){

                System.out.print(nums[i][j]);

            }
            width++;
            System.out.println();

        }

    }

}
