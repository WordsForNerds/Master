package Example5;

public class SuperFun {


    SuperFun(){


    }

    protected int num1;

    SuperFun(int num){

        this.num1 = num;

    }

    public void getData(){

        System.out.println("Суперкласс SuperFun. Значение поля: " + num1);

    }

}
