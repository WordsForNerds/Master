package Example2;

public class SuperFun {

    protected String str1;

    //Сеттер строки суперкласса
    public void setString(String str1){

        this.str1 = str1;

    }
     public String getString(){

        return str1;

    }

    //Метод для присваивания значения строке
    SuperFun(String str){

        this.str1 = str;

    }

    //Метод возвращающий длину строки
    public Integer getLength(){

        return str1.length();

    }

    //Конструктор без аргументов
    SuperFun(){



    }

}
