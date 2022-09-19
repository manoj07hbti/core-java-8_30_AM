package collection;

import java.util.ArrayList;

public class Demo {


    public void demo(){

        String city="AGRA";
        int age= 23;
        int marks=70;

        //SYNTAX : Collection_name obj= new CollectionName();

        ArrayList list= new ArrayList();

        list.add("AGRA");
        list.add(23);
        list.add(70);

        System.out.println(list);


    }

    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.demo();

    }
}
