package conditional_statements;

public class NOTOperator {

    public static void main(String[] args) {

        int age=19;

        if(!(age>18)){

            System.out.println("Eligible for voting....");
        }
        else {
            System.out.println("Not Eligible for voting .......");
        }



        if(!(age<18)){
            System.out.println("Person is Child ....");
        }
        else {
            System.out.println("Person is not CHILD ");
        }

    }
}
