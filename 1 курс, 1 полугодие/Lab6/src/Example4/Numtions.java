package Example4;

public class Numtions {

    static int num = 1;

    public static void function(int _num){

        for( int i = _num; i > 0; i = i - 2){

            num = num * i;

        }

        System.out.println("Двойной факториал из этого числа: " + num);

    }
}
