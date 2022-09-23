package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoHashSet {

    public  HashSet<String> createStringHashSet(){
        //SYNTAX : HashSet <DATATYPE> objName= new HashSet<>();

       HashSet<String> course= new HashSet<>();

        course.add("Java");
        course.add("Java");
        course.add("Spring");
        course.add("Spring Boot");
        course.add("Spring Boot");
        course.add("Cloud");

        return course;
    }
    //Integer HashSet

    //Double HashSet

    public static void main(String[] args) {

        DemoHashSet obj= new DemoHashSet();
        HashSet<String> course= obj.createStringHashSet();

        for(String var : course){

            System.out.println("Printing set: "+var);
        }
    }
}
