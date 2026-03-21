package Example1;

//1.	Напишите программу, в которой есть суперкласс с приватным текстовым полем,
// конструктором с текстовым параметром и где переопределен метод toString ().
// На основе суперкласса путем наследования создается подкласс.
// У него появляется еще одно приватное текстовое ноле.
// Также подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами,
// а еще в нем должен быть переопределен метод toString ().
// В обоих классах метод toString () переопределяется так, что он возвращает строку с названием
// класса и значение текстового поля или текстовых полей.

public class Main {

    public static void main(String[] args){

        SuperFun superFunObject =
                new SuperFun("Передал в конструктор суперкласса");
        String className = superFunObject.toString();
        System.out.println(className);

        Fun subFunObject1 =
                new Fun("Передал в конструктор подкласса");
        String subClassName1 = subFunObject1.toString();
        System.out.println(subClassName1);

        Fun subFunObject2 =
                new Fun("Передал в конструктор подкласса", "Где два параметра");
        String subClassName2 = subFunObject2.toString();
        System.out.println(subClassName2);

    }

}
