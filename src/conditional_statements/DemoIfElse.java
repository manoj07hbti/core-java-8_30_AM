package conditional_statements;

public class DemoIfElse {


    public static void main(String[] args) {


        int age=17;

        if(age>18){

            System.out.println("Eligible for Voting ");
        }
        else {
            System.out.println("Not Eligible for voting ");
        }

        String city="DELHI";

        if (city=="AGRA"){
          System.out.println("You are in AGRA..........");
        }
        else {
            System.out.println("You are not in AGRA....");
        }

    }
}
