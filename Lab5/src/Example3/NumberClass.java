package Example3;

public class NumberClass {


    public static class NumberClassOne{

        public NumberClassOne(){

            System.out.println("Объект 1 был создан,у него нет полей");

        }


    }

    public static class NumberClassTwo{

        private int num1;

        public NumberClassTwo(int _num1){

            num1 = _num1;

            System.out.println("Объект 1 был создан,у него есть одно поле: " + num1);

        }


    }

    public static class NumberClassThree{

        private int num1;
        private int num2;

        public NumberClassThree(int _num1,int _num2){

            num1 = _num1;
            num2 = _num2;

            System.out.println("Объект 1 был создан,у него есть два поля: " + num1 + " " + num2);

        }


    }


}


