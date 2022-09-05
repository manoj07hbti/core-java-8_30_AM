package arrays;

public class DemoArray {

    public static void main(String[] args) {

        String city1="Agra";
        String city2="Pune";
        String city3="Jaipur";
        String city4="Kanpur";
        String city5="Delhi";

        //SYNTAX    Datatype [] varName= { value1,value2....valueN};

        String [] cities= {"Agra","Pune","Jaipur","Kanpur","Delhi","Kolhapur","Mumbai"};

        // accessing arrays elements  varName[INDEX];

        System.out.println("Printing Arrays Element : "+ cities[1]);
        System.out.println("Printing Arrays Element : "+ cities[4]);
        System.out.println("Printing Arrays Element : "+ cities[3]);

        // printing all elements of arrays  : length method gives size of array

        for (int i=0; i<cities.length; i++){

            System.out.println("Printing in Loop .." + cities[i]);
        }

        // Advanced for loop : for (DATATYPE var : arrayName) { CODE }

        for (String var: cities){

           System.out.println("Printing in Advanced for loop .. "+ var);
        }

        //SYNTAX    Datatype [] varName= { value1,value2....valueN};

        int [] marks ={43,45,34,56,34,67,87,89};

        for (int var : marks){

            System.out.println("Printing marks : "+var);
        }

    }
}
