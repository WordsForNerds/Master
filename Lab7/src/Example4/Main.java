package Example4;

public class Main {

    public static void main(String[] args){

        SuperFun superFunObject = new SuperFun(1);
        superFunObject.getCopy();
        System.out.println(" ");

        Fun funObject = new Fun(23,"Строка");
        funObject.getCopy();
        System.out.println(" ");

        SubFun subFunObject = new SubFun(100,"Ещё одна строка", 76);
        subFunObject.getCopy();
        System.out.println(" ");


    }
}
