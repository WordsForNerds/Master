package Example5;

public class Numtions {

    static int num = 0;

    public static void function(int _num){

        for( int i = _num; i > 0; i--){

            num = num + i * i;

        }

        System.out.println("Сумма квадратов натуральных чисел: " + num);

    }
}
