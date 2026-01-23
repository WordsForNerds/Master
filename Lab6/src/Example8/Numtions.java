package Example8;

public class Numtions {

    public static Integer out (int[] _arr){

        int num = 0;

        for( int i = 0; i < _arr.length; i++){

            num += _arr[i];

        }
        num /= _arr.length;



        return num;

    }

}
