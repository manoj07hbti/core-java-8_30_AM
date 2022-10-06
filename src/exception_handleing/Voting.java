package exception_handleing;


public class Voting {

    public void vote(int age) throws AgeNotElligibleExcpetion{

        if(age<18){

            throw new AgeNotElligibleExcpetion("Candidate age should be greater than 18");
        }
        else {

            System.out.println("Welcome to Voting Application ");
        }

    }


    public static void main(String[] args) {

        Voting obj = new Voting();

        try {

            obj.vote(17);
        }
        catch (Exception e){
            System.out.println("Exception occurred "+e);
        }

    }

}
