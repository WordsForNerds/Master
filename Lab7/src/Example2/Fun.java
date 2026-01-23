package Example2;

public class Fun extends SuperFun{

    public int num1;
    SuperFun superFunObject = new SuperFun();

    public void setData(){

        this.num1 = 0;
        this.str1 = "0";

    }

    public void setData(int num){

        this.num1 = num;

    }

    public void setData(int num, String str){

        this.num1 = num;
        this.str1 = str;

    }

    @Override
    public void setString(String str){

        this.str1 = str;
    }

    Fun(int num, String str){

        this.num1 = num;
        this.str1 = str;

    }

    public void getData(){

        System.out.println(num1 + " " + str1);

    }

}
