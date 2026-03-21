package Example1;

public class Fun extends SuperFun {


    private String str2;
    private String str3;



    //Конструктор с одним параметром, который ссылается на конструктор суперкласса
    Fun(String text){

        super(text);

    }

    //Конструктор с двумя параметрами
    Fun(String textOne, String textTwo){

        this.str2 = textOne;
        this.str3 = textTwo;

    }

    @Override
    public String toString(){

        String nameField;
        nameField = "sub" + "\n" + " Class name : " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " str 2 = " + this.str2 + "\n" +
                " str 3 = " + this.str3;

        return nameField;

    }

    //Геттеры и сеттерыы
    public String getStr3(){

        return str3;

    }
    public void setStr3(String str3){

        this.str3 = str3;

    }
    public String getStr2(){

        return str2;

    }
    public void setStr2(String str2){

        this.str2 = str2;

    }

}
