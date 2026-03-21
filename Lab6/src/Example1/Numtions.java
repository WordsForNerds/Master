package Example1;

public class Numtions {

    private int num;
    private String str;
    private String strArray = "";

    //Метод с параметром число
    public void function(int _num){



    num = _num;
    System.out.println("Метод принимающий число содержит: " + num);

    }

    //Метод с параметром строка
    public void function(String _str){

    str = _str;
        System.out.println("Метод принимающий строку содержит: " + str);

    }

    //Метод с параметром массив
    public void function(int[] _nums){

        if(_nums.length == 1){

            num = _nums[0];
            System.out.println("Метод принимающий массив с одноим числом содержит: " + num);

        } else {

            for(int i = 0; i < _nums.length; i++){

                strArray += _nums[i];

            }
            System.out.println("Метод принимающий массив с разным количеством чисел содержит: " + strArray);

        }



    }

}


