package collection;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

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

        studentMap.put("A",studentArrayList);


    }

}
