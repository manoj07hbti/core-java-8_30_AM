package collection;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void createHashMap(){

        //TODO SYNTAX: HashMap <Key_Datatype, Value_Datatype> objName= new HashMap<>();

        HashMap<Integer,String> hashMap= new HashMap<>();

        // Add element in HashMap
        hashMap.put(1,"Java");
        hashMap.put(2,"Spring");
        hashMap.put(3,"Spring boot");
        hashMap.put(4,"Cloud");
        hashMap.put(2131,"Random");

        //reading data from map get(key);

        System.out.println("Printing value for key 3 "+hashMap.get(3));
        System.out.println("Printing value for key 1 "+hashMap.get(1));
        System.out.println("Printing value for key 2 "+hashMap.get(2));
        System.out.println("Printing value for key 2131 "+hashMap.get(2131));

        // reading hashmap using loop: keySet method gives set of keys in map

        Set<Integer> keys = hashMap.keySet(); // return all the Keys of Map as a set

        for (Integer var: keys){

            System.out.println("Printing map data: "+hashMap.get(var));
        }


    }

    public static void main(String[] args) {
        DemoHashMap obj = new DemoHashMap();
        obj.createHashMap();
    }
}
