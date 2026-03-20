package Example2;

public class NumberClass {

    private int num1;
    private int num2;

    public void setValues(int _num1, int _num2){

        num1 = _num1;
        num2 = _num2;
    }

    public void out(){

        if(num1>num2) {

            for( int i = num1; i >= num2; i--){

                System.out.println(i + " ");

            }

        } else {

            for( int i = num1; i <= num2; i++){

                System.out.println(i + " ");

            }

        }

    }

}
