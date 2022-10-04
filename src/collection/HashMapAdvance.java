package collection;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapAdvance {

    public static void main(String[] args) {

        HashMap <String, ArrayList> arrayListHashMap= new HashMap<>();

        ArrayList arrayList= new ArrayList();
        arrayList.add("java");
        arrayList.add("Spring");
        arrayList.add("Spring Boot");

        arrayListHashMap.put("A",arrayList);


        ArrayList arrayList1= new ArrayList();
        arrayList.add(12);
        arrayList.add(33);
        arrayList.add(33);

        arrayListHashMap.put("B",arrayList1);


        HashMap <String, ArrayList<Student>> studentMap= new HashMap<>();

        Student student1= new Student("Raj",23,"CS");
        Student student2= new Student("Rohit", 21,"IT");
        Student student3= new Student("Jatin",20,"CS");
        Student student4= new Student("Raj",23,"CS");
        ArrayList<Student> studentArrayList= new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        ArrayList<Student> studentArrayListArt= new ArrayList<>();

        Student student5= new Student("Raj",23,"ART");
        Student student6= new Student("Rohit", 21,"ART");
        Student student7= new Student("Jatin",20,"ART");
        studentArrayListArt.add(student5);
        studentArrayListArt.add(student6);
        studentArrayListArt.add(student7);

        studentMap.put("A",studentArrayList);
        studentMap.put("B",studentArrayListArt);


        ArrayList<Student> studentArrayListCS=  studentMap.get("A");
        for (Student var: studentArrayListCS){

            System.out.println("CS Students :"+var.getName()+" Branch: "+var.getSection());
        }


        //STEP 1 get all the keys of MAP

           Set<String > keys =studentMap.keySet();

          for (String var : keys){

              ArrayList<Student> students= studentMap.get(var);

              for(Student var1: students){

                  System.out.println("Printing entire Map "+var1.getName()+" Section: "+var1.getSection());
              }
          }

    }

}
