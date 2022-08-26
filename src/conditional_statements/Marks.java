package conditional_statements;

public class Marks {

    public static void main(String[] args) {

     int maeks=56;
     String section="ART";

     if(maeks>33 & (section=="ART" || section=="SCIENCE")){

         System.out.println("Student is passed with marks: "+maeks + " and section "+section);
     }
     else {

         System.out.println("Student did not Pass ");
     }

    }
}
