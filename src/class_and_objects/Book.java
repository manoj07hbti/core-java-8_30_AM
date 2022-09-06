package class_and_objects;

public class Book {

    //properties or DATA MEMBER

    String name="Java";
    int pages=500;
    String writerName="Games Gosling";

    public static void main(String[] args) {

        // Creating Object
        //TODO   ClassName ObjName= new ClassName();

        Book obj1= new Book();// object created
        Book obj2= new Book();
        Book obj3= new Book();

        // access object properties
        //TODO   objName.propertyName

        System.out.println("Printing Book Name "+obj1.name);
        System.out.println("Printing Book pages "+obj1.pages);
        System.out.println("Printing Book Writer Name "+obj1.writerName);


    }


}
