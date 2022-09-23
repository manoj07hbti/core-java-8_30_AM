package collection;

import model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public  HashSet<Student> createStudentSet(){

        HashSet <Student> students= new HashSet<>();

        // 1- create data for student
        Student student1= new Student("Raj",23,"CS");
        Student student2= new Student("Rohit", 21,"IT");
        Student student3= new Student("Jatin",20,"CS");

        //2- add the data

        students.add(student1);
        students.add(student2);
        students.add(student3);


        return students;
    }

    public static void main(String[] args) {
        StudentHashSet obj = new StudentHashSet();
        HashSet<Student> students= obj.createStudentSet();

        for(Student var : students){

          System.out.println("Printing Data :"+var.getName()+" Age: "+var.getAge()+" Section: "+var.getSection());
        }
    }
}
