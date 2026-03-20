package Example4;

public class NumberClass {

    String str1;
    String str2;
    double num1;

    public NumberClass(String _str,double _num){

        System.out.println("Объект создан");

        num1 = Math.round(_num);
        str1 = _str + String.format("%.0f",num1);

         String str3 = String.format("%.2f",_num);
         str2 = Character.toString(str3.charAt(str3.length() - 2 )) + Character.toString(str3.charAt(str3.length() - 1));

        System.out.println(str1 + "   " + str2);

    }


}
