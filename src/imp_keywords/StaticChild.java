package imp_keywords;

public class StaticChild extends DemoStatic{


    public static void m1(){

        System.out.println("CHILD THIS IS static method ");

    }

    public static void main(String[] args) {

        StaticChild.m1();
    }
}
