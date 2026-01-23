package Example4;

public class SubFun extends Fun{

    public int num2;
    protected int copy;

    SubFun(int num1,String str1,int num2){

        super(num1,str1);
        this.copy = num2;
        this.num2 = num2;

    }

    public void getCopy(){

        System.out.print("Содержимое саб класса: " + num1 + " " + str1 + " " + num2);

    }



}
