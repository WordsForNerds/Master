package Example9;

//9.	Напишите программу со статическим методом, аргументом которому
// передается одномерный символьный массив. В результате вызова метода
// элементы массива попарно меняются местами: первый — с последним, второй —
// с предпоследним и так далее.

public class Main {

    public static void main(String[] args){

        System.out.println("Создаётся массив чисел - [1,2,3,4,5,6,7,8]");
        System.out.println("Теперь при помощи метода класса поменяем некоторые символы местами");

        int[] array = new int[] {1,2,3,4,5,6,7,8};
        int[] result = new int[array.length];

        Numtions tion = new Numtions();
        result = tion.function(array);

        for( int i = 0; i < result.length; i++){

            System.out.print(result[i] + " ");

        }
    }

}
