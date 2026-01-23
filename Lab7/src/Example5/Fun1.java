package Example5;

public class Fun1 extends SuperFun {

    protected int num2;

    Fun1(int num1, int num2){

        super(num1);
        this.num2 = num2;

    }
    public void getData(){

        System.out.println("Класс Fun1. Значение полей: " + num1 + " " + num2);

    }

}
