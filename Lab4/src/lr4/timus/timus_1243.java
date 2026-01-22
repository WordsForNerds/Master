package lr4.timus;
import java.util.Random;

public class timus_1243 {

    public static void main(String[] args){

        Random rnd = new Random(System.currentTimeMillis());
        int items =  rnd.nextInt(1000);
        System.out.println(items%7);

    }




}
