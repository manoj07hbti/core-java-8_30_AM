package imp_keywords;

public class DemoStatic {

    String name="Java";// non static data
    static int age=23;

    public static void m1(){

        System.out.println("THIS IS static method ");
       // System.out.println("Printing Non Static Data : "+name);

    }


    public static void main(String[] args) {

        //SYNTAX : CLASSNAME.METHODNAME();
        DemoStatic.m1();
    }
}
