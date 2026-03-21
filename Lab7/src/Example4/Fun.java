package Example4;

public class Fun extends SuperFun{

    public String str1;
    protected String copy;

    Fun(int num1,String str1){

        super(num1);
        this.copy = str1;
        this.str1 = str1;

    }

    public void getCopy(){

        System.out.print("Содержимое класса: " + num1 + " " + str1);

    }







    Fun(){



    }
}
