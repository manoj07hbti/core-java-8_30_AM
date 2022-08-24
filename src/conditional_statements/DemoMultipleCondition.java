package conditional_statements;

public class DemoMultipleCondition {

    public static void main(String[] args) {

       int age=19;
       String city="AGRA";

       //SYNTAX: if (condition1 operator condition2 operator condition3.......)
       // if (condition1 & condition2)

// TRUE & TRUE= TRUE (1X1=1)
        if(age>18 & city=="AGRA"){

            System.out.println("You are eligible for voting in Agra ....");
        }
        else {
            System.out.println("Not Eligible for voting in Agra....");
        }

        //TRUE & FALSE=FALSE(1X0=0)
        city="PUNE";

        if(age>18 & city=="AGRA"){

            System.out.println("You are eligible for voting in Agra ....");
        }
        else {
            System.out.println("Not Eligible for voting in Agra....TRUE & FALSE=FALSE(1X0=0) ");
        }

        //  FALSE & TRUE =FALSE(0X1=0)
        age=17;
        city="AGRA";
        if(age>18 & city=="AGRA"){

            System.out.println("You are eligible for voting in Agra ....");
        }
        else {
            System.out.println("Not Eligible for voting in Agra....FALSE & TRUE =FALSE(0X1=0) ");
        }

        //FALSE & FALSE= FALSE(0X0=0)
        city="PUNE";

        if(age>18 & city=="AGRA"){

            System.out.println("You are eligible for voting in Agra ....");
        }
        else {
            System.out.println("Not Eligible for voting in Agra....FALSE & FALSE= FALSE(0X0=0) ");
        }


    }
}
