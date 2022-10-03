package oops.polymorphism;

public class DemoChild extends DemoParent {

    @Override
    public void m1(){
        System.out.println("This is CHILD M1 method");
    }

    public static void main(String[] args) {

        //Q1
        DemoParent obj = new DemoParent();
        obj.m1();//PARENT

        //Q2
        DemoParent obj1= new DemoChild();
        obj1.m1();//CHILD

        //Q3
       /* DemoChild obj3= new DemoParent();
        obj3.m1();// Compiletime Error */
    }
}
