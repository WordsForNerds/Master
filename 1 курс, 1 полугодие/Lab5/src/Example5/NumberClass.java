package Example5;

public class NumberClass {

    int num;

    public NumberClass(int _num){

        System.out.println("Объект создан");
        if(_num>100){

            num = 100;

        } else {

            num = _num;

        }

    }

    public NumberClass(){

        num = 0;

    }

    public void out(){

        System.out.println("Вот ваше число " + num);

    }

}
