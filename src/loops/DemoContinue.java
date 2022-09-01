package loops;

public class DemoContinue {

    public static void main(String[] args) {

        for (int i=0; i<10; i++){

            if(i==3){
                continue;
            }
            System.out.println("1.This is for loop "+i);
            System.out.println("2.This is for loop "+i);

        }
    }
}
