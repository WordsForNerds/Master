package Example6;

public class Numtions {

    public static int[] function (int[] _arr, int _num){

        if(_num > _arr.length){

            int[] arr = new int[_arr.length];

            for( int i = 0; i < _arr.length  ; i++ ){

                arr[i] = _arr[i];

            }

            return arr;

        }

        int[] arr = new int[_num];

        for( int i = 0; i < _num  ; i++ ){

            arr[i] = _arr[i];

        }

        return arr;


    }

}
