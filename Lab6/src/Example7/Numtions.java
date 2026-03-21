package Example7;

public class Numtions {

    public static int[] function (String[] _arr){

       //Создаём числовой массив такой же длинны как исходный строчный массив
       int[] arr = new int[_arr.length];
       String str;


        //преобразуем каждый символ массива строк в челочисленный номер сохраняя его в массив чисел
        for(int i = 0; i < _arr.length; i++){

        arr[i] =  _arr[i].charAt(0);

        }

        return arr;



    }

}
