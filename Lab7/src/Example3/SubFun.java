package Example3;

public class SubFun extends Fun{

    public String str1;

    public void setData(int num1, int num2, String str1){

        this.num1 = num1;
        this.num2 = num2;
        this.str1 = str1;

    }
    SubFun(int num1, int num2, String str1){

        this.num1 = num1;
        this.num2 = num2;
        this.str1 = str1;

    }

    public String toString(){

        String nameField;
        nameField = "sub" + "\n" + " Class name : " + this.getClass().getSimpleName() + "\n" +
                " num1 = " + this.num1 + "\n" + "num2 = " + this.num2 + "\n" + " str1 = " + this.str1;


        return nameField;

    }

}
