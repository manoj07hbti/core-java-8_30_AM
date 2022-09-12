package methods;

public class Calculator {

    // 1. Add 2. sub 3.divide 4.multi

    //  SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    public void addition(){

        int a=3;
        int b=9;

        int result=a+b;

        System.out.println("SUM of a and b is : "+result);
    }

    //subtraction a-b

    // multi a*b

    // divide a/b
    //  SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    public void divide(){
        int a=123;
        int b=23;

        double result=(double) a/b;

        System.out.println("Division of a and b is : "+result);

    }


    public static void main(String[] args) {

        Calculator obj= new Calculator();// STEP 1
        obj.addition();// STEP 2 OBJ>METHOD_NAME();

        // call subtraction method

        // call multiply method

        // call divide method
        obj.divide();
    }

}
