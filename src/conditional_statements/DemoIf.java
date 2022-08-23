package conditional_statements;

public class DemoIf {

    public static void main(String[] args) {

        //SYNTAX : if (condition){
        //                //CODE
        //            }


        int age=17;

       if(age>18){

        System.out.println("Eligible for Voting ....");
       }

       if(age<18){

         System.out.println(" Not Eligible for Voting .....");
       }

       String city="AGRA";

       if(city=="AGRA"){

           System.out.println("you are in Agra ...");
       }

    }
}
