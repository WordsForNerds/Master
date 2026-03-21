package lr4;

//7.Напишите программу, в которой создается двумерный числовой массив и этот
// массив заполняется «змейкой»: сначала первая строка (слева направо), затем последний
// столбец (сверху вниз), вторая строка (справа налево) и так далее, как показано на рисунке:
public class Example7 {
    public static void main(String[] args){

        int height = 8; //Число строк, которое необходимо вывести
        int width = 9;  //Число столбцов, которое необходимо вывести
        int surface = 1; //Число, котоое будет записываться в массив для наглядности

        int[][] nums = new int[height][width] ;

        //Заполняем массив змейкой по 2 строчки
        for(int i = 0 ; i < height ; i++){

            for ( int j = 0; j < width; j++){

                nums[i][j] = surface;
                surface++;

            }
            surface = 1;

            i++;

            for ( int j = 8; j >= 0; j--){

                nums[i][j] = surface;
                surface++;

            }
            surface = 1;

        }

        //Выводим всё на экран
        for(int i = 0 ; i < height; i++){

            for ( int j = 0; j < width; j++){

                System.out.print(nums[i][j]);

            }
            System.out.println();

        }

    }

}
