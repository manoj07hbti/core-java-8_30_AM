package oops.polymorphism;

public class DemoMethodOverLoading {

    public void m1(){

        System.out.println("This is m1 method ");
    }

    //TODO same method  but we will add differenet parameter

    public void m1(String name){

        System.out.println("This is overloaded method "+name);
    }

    public void m1(int age){

        System.out.println("This is overloaded method : "+age);
    }

    public void m1(int age , String name ){

        System.out.println("Overloaded method "+ name + " Age "+age);
    }


    public static void main(String[] args) {
        DemoMethodOverLoading obj = new DemoMethodOverLoading();
        obj.m1();
        obj.m1("Raj");
        obj.m1(33);
        obj.m1(33,"Rahul");
    }

}
