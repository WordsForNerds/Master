package lr4;

//3.Напишите программу, в которой создается двумерный массив, который выводи прямоугольник из цифр 2;
public class Example3 {
    public static void main(String[] args){

        int height = 3; //Число строк, которое необходимо вывести
        int width = 9;  //Число столбцов, которое необходимо вывести

        int[][] nums = new int[height][width] ;

        //Заполняем массив двойками
        for(int i = 0 ; i < height; i++){

            for ( int j = 0; j < width; j++){

                nums[i][j] = 2;

            }

        }

        for(int i = 0 ; i < height; i++){

            for ( int j = 0; j < width; j++){

                System.out.print(nums[i][j]);

            }
            System.out.println();

        }

    }

}
