package Example10;

public class Numtions {

    public static int[] function (int ... v){

        int max = 0;
        int min = 0;
        int[] arr = new int[2];
        min = v[0];

        for(int i = 0; i < v.length; i++) {

            if(v[i] > max){

                max = v[i];

            }
            if(v[i] < min){

                min = v[i];

            }

        }
        arr[0] = min;
        arr[1] = max;

        return arr;
    }


}
