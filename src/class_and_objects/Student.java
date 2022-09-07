package class_and_objects;

public class Student {

    //Data members

    String name;
    int age;
    String section;


    //parameterized constructor

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }


    public static void main(String[] args) {

        //TODO   ClassName ObjName= new ClassName(prop1_value, prop2_value,......);

        Student student1= new Student("Raj",23,"CS");

        System.out.println("Printing  name: "+student1.name +" Age: "+student1.age +" Section: "+student1.section);

        Student student2= new Student("Rahul",20,"IT");

        System.out.println("Printing  name: "+student2.name +" Age: "+student2.age +" Section: "+student2.section);

        Student student3= new Student("Mukesh",23,"CS");

        System.out.println("Printing  name: "+student3.name +" Age: "+student3.age +" Section: "+student3.section);
    }
}
