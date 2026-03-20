package Example3;

public class SuperFun {

    public int num1;

    //Геттер
    public void setData(int num){

        this.num1 = num;

    }

    //Конструктор с одним параметром
    SuperFun(int num){

        this.num1 = num;

    }

    //Конструктор без параметров
    SuperFun(){



    }
    @Override
    public String toString(){

        String nameField;
        nameField = "super" + "\n" + " Class name : " + this.getClass().getSimpleName() + "\n" +
                " num1 = " + this.num1;


        return nameField;

    }

}
