package Example3;

public class Fun extends SuperFun{

    int num2;

    public void setData(int num1, int num2){

        this.num1 = num1;
        this.num2 = num2;

    }

    Fun(int num1, int num2){

        this.num1 = num1;
        this.num2 = num2;

    }

    Fun(){



    }
    public String toString(){

        String nameField;
        nameField = "Class" + "\n" + " Class name : " + this.getClass().getSimpleName() + "\n" +
                " num1 = " + this.num1 + "\n" + "num2 = " + this.num2;


        return nameField;

    }

}
