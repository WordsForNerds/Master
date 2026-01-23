package Example3;


public class Numtions {

    static int max = 0;
    static int min = 0;
    static int mid = 0;

    static void out(int ... v) {

        for(int i = 0; i < v.length; i++) {

            if(i == 0){

                max = v[i];
                min = v[i];

            }
            if(v[i] > max){

                max = v[i];

            }
            if(v[i] < min){

                min = v[i];

            }

        }
        for(int i = 0; i < v.length; i++){

         mid += v[i];

        }
        mid /= v.length;

        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
        System.out.println("Среднее значение из чисел: " + mid);
        System.out.println(" ");


    }

}
