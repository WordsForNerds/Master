package Example6;

public class NumberClass {

    private int min;
    private int max;



    public NumberClass(int _num1, int _num2){

        if(_num1 > _num2){

            max = _num1;
            min = _num2;

        } else {

            max = _num2;
            min = _num1;

        }


    }

    public void set(int _num1){

        if(_num1 > max){

            max = _num1;

        } else {

            min = _num1;

        }

    }

    public void set(int _num1, int _num2){

        if(_num1 > _num2){

            max = _num1;
            min = _num2;

        } else {

            max = _num2;
            min = _num1;

        }

    }

    public void out(){

        System.out.println("Вот ваши числа " + min + " и " + max);

    }
}
