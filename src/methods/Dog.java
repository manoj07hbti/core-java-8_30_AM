package methods;

public class Dog {

    //data members
    String breed;
    int height;
    int weight;


    // methods or function or capabilities

    // bark , eat , play
 /* TODO
        SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}
        ..
        access_specifier -> public , private , protected , default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/

//SYNTAX : access_specifier return_type  method_name (parameter) {CODE..}

    public void barkMethod () {

        System.out.println("This is bark method of Dog Class...");
    }

    public void eatMethod(){

        System.out.println("This is Eat Method of Dog Class .....");
    }

    public void playMethod(){

        System.out.println("This is Play Method of dog class ....");
    }



    public static void main(String[] args) {

        // STEP 1 CREATE OBJECT   CLASSNAME OBJ_NAME= NEW CLASSNAME();
        Dog obj= new Dog();

        //STEP 2 OBJ_NAME.METHOD_NAME():
        obj.barkMethod();// CALLING BARK METHOD

        obj.eatMethod();// CALLING EAT METHOD

        obj.playMethod();// CALLING PLAY METHOD
    }

}
