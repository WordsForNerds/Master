package Example7;


//7.	Напишите программу со статическим методом,
// аргументом которому передастся символьный массив, а результатом возвращается ссылка на целочисленным
// массив, состоящий из кодов символов из массива- аргумента.

public class Main {

    public static void main(String[] args){

        System.out.println("Создаётся массив символов - [A,B,D,H,G,S,W,Q]");
        System.out.println("Он передаётся в нашу функцию");
        System.out.print("Вот полученный массив кодов символов исходного массива ");

        //Создаём массив строк и объект
        String[] arrayStr = new String[] {"A","B","D","H","G","S","W","Q"};
        int[] arrayInt = new int[arrayStr.length];
        Numtions tion = new Numtions();

        //Загружаем в массив чисел массив строк, который обработан методом нашего объекта
        arrayInt = tion.function(arrayStr);

        //Выводим в консоль получившийся массив
        for( int i = 0; i < arrayInt.length  ; i++ ){

            System.out.print(arrayInt[i] + " ");

        }

    }

}
