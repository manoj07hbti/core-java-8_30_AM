package oops.inheritance;

public class A {

    String name="XYZ";

    public void m1(){

        System.out.println("THis is M1 method of class A");
    }
    public void m2(){

        System.out.println("THis is M2 method of class A");
    }


    public static void main(String[] args) {
        A obj= new A();
        obj.m1();
    }
}
