package collection;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public  ArrayList<Student> createStudentList(){

        //SYNTAX :   ArrayList <DATATYPE> objName= new ArrayList<>();

        ArrayList <Student> studentArrayList= new ArrayList<>();

        // step 1 data of Student
        Student student1= new Student("Raj",23,"CS");
        Student student2= new Student("Rohit", 21,"IT");
        Student student3= new Student("Jatin",20,"CS");

        // step 2 add data to list
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        return studentArrayList;

    }

    public static void main(String[] args) {
        StudentArrayList obj= new StudentArrayList();
        ArrayList<Student> studentArrayList= obj.createStudentList();

        for(int i=0; i<studentArrayList.size(); i++){

            System.out.println("Name: "+ studentArrayList.get(i).getName()+" Age: "+studentArrayList.get(i).getAge()+" Section: "+studentArrayList.get(i).getSection());
        }

        // advanced loop

        for (Student var: studentArrayList){

          System.out.println("Advanced loop :" +var.getName() +" Age:"+var.getAge()+" Section: "+var.getSection());
        }

    }

}
