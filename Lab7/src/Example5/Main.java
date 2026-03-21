package Example5;

public class Main {

    public static void main(String[] args){

        SuperFun superFunObject = new SuperFun(1);
        Fun1 fun1Object = new Fun1(3,5);
        Fun2 fun2Object = new Fun2(16,23);

        superFunObject.getData();
        fun1Object.getData();
        fun2Object.getData();

        //Здесь объектная переменная ссылая на переменную подкласса
        System.out.println("Вызываю метод через объекттную переменную суперкласса");
        superFunObject = fun1Object;
        superFunObject.getData();


    }

}
