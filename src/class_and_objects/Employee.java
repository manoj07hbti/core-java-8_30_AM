package class_and_objects;

public class Employee {

   // DATA Member
   String name="Raj";
   int age=25;
   String dept="CS";
   double salary=25000.67;


    public static void main(String[] args) {

        //TODO   ClassName ObjName= new ClassName();


        Employee obj1= new Employee();
        Employee obj2= new Employee();
        Employee obj3= new Employee();

        System.out.println("Printing employee Name: "+obj1.name + " Age: "+obj1.age + " Dept: "+ obj1.dept + " Salary: "+obj1.salary);

    }
}
