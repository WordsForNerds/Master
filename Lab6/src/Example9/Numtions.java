package Example9;

public class Numtions {

    public static int[] function (int[] _arr){

        int[] arr = new int[_arr.length];
        int middle;

        for( int i = 0; i < arr.length / 2; i++){

            middle = _arr[i];
            arr[i] = _arr[_arr.length - i - 1];
            arr[_arr.length - i - 1] = middle;

        }




        return arr;
    }

}
