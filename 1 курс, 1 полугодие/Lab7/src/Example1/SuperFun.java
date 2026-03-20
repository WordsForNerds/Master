package Example1;

public class SuperFun {

    private String str1;

    //Конструктор с одним параметром
    SuperFun(String str){

        this.str1 = str;

    }

    //Базовый конструктор суперкласса
    public SuperFun(){



    }

    @Override
    public String toString(){

        String superNameField;
        superNameField = "super" + "\n" + "Class name: " + this.getClass().getSimpleName() +
                "\n" + "str1 = " + this.getStr1();

        return superNameField;

    }

    //Геттер и сеттер
    public String getStr1(){

        return str1;

    }

    public void setStr1(){

        this.str1 = str1;

    }





}
