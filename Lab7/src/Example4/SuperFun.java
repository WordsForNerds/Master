package Example4;

public class SuperFun {

    public int num1;
    protected int copy;


    SuperFun(int num1){

        this.copy = num1;
        this.num1 = num1;

    }

    public void getCopy(){

        System.out.print("Содержимое супер класса: " + num1 );
    }

    SuperFun(){



    }
}
