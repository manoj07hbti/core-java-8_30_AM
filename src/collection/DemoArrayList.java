package collection;

import java.util.ArrayList;

public class DemoArrayList {

    public void createList(){

        //SYNTAX : ArrayList objName= new ArrayList();

        ArrayList arrayList= new ArrayList();

        arrayList.add("Java"); // 0 index
        arrayList.add("Spring");// 1 index
        arrayList.add("Spring Boot");// 2 index
        arrayList.add(33);// 3 index
        arrayList.add(34.7);// 4 index


        // printing all data from list
        for (int i=0; i<arrayList.size(); i++){

            System.out.println("Printing List in loop "+ arrayList.get(i));
        }

        // advance for loop  for (Datatype var: collection/array){ CODE }

        for (Object var: arrayList){

            System.out.println("Printing in Advanced loop : "+var);
        }

        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

        arrayList.remove(4);

        arrayList.remove(1);
        System.out.println("After remove");
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));





    }


    public static void main(String[] args) {

        DemoArrayList obj = new DemoArrayList();
        obj.createList();

    }
}
