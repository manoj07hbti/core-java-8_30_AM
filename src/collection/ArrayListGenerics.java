package collection;

import java.util.ArrayList;

public class ArrayListGenerics {

    // create String ArrayList

    public  ArrayList<String> createStringList(){

        //SYNTAX : ArrayList<DATATYPE> objName= new ArrayList();

        ArrayList <String> stringArrayList= new ArrayList<>();

        stringArrayList.add("Java");
        stringArrayList.add("Spring Boot");
        stringArrayList.add("Microservices");
        stringArrayList.add("Cloud");

        return stringArrayList;
    }

    // create Integer ArrayList

    // create Double ArrayList

    public static void main(String[] args) {

        ArrayListGenerics obj = new ArrayListGenerics();

        ArrayList<String> stringArrayList=   obj.createStringList();

        for(int i=0; i<stringArrayList.size(); i++){

            System.out.println("Printing List in for loop : "+stringArrayList.get(i));
        }

        //TODO Advance for loop   for (Datatype var: collection){}

        for (String var : stringArrayList){

            System.out.println("Printing list in advanced loop : "+var);
        }
    }
}
