package conditional_statements;

public class OROperator {

    public static void main(String[] args) {

        int marks = 75;

        String section = "SCIENCE";

        // TRUE||TRUE= TRUE

        if (marks > 70 || section == "SCIENCE") {

            System.out.println("Good Student with Bright future ... TRUE||TRUE= TRUE");
        } else {

            System.out.println("Not Good future");
        }


        // TRUE||FALSE=TRUE (1+0=1)
        section = "ART";

        if (marks > 70 || section == "SCIENCE") {

            System.out.println("Good Student with Bright future ...TRUE||FALSE=TRUE (1+0=1)");
        } else {

            System.out.println("Not Good future");
        }

        //FALSE || TRUE= TRUE (0+1=1)

        marks = 60;
        section = "SCIENCE";
        if (marks > 70 || section == "SCIENCE") {

            System.out.println("Good Student with Bright future ...FALSE||TRUE=TRUE (0+1=1)");
        } else {

            System.out.println("Not Good future");
        }

        //FALSE|| FALSE= FALSE(0+0=0)
        marks = 40;
        section = "ART";

        if (marks > 70 || section == "SCIENCE") {

            System.out.println("Good Student with Bright future ...");
        } else {

            System.out.println("Not Good future...........FALSE|| FALSE= FALSE(0+0=0)");
        }


    }
}
