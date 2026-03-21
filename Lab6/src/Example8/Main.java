package Example8;

//8.	Напишите программу со статическим методом, аргументом которому передается целочисленный массив,
// а результатом возвращается среднее значение для элементов массива (сумма значений элементов,
// деленная на количество элементов в массиве).

public class Main {

    public static void main(String[] args){

        System.out.println("Создаётся массив чисел - [1,2,3,4,5,6,7,8,9]");
        System.out.println("Теперь при помощи метода другого класса мы найдём их среднее значение");

        int[] array = new int[] {1,2,3,4,5,6,7,8,9};
        int middle;

        Numtions function = new Numtions();
        middle = function.out(array);

        System.out.println(middle);

    }

}
