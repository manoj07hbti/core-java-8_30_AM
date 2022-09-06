package class_and_objects;

public class Dog {

    // DATA Member
    String breed="Beagle";
    double height=12.5;
    int weight= 30;


    public static void main(String[] args) {

        //TODO   ClassName ObjName= new ClassName();
        Dog obj1= new Dog();
        Dog obj2= new Dog();
        Dog obj3= new Dog();

        System.out.println("Printing Dog breed : "+obj1.breed + " Height: "+obj1.height + " Weight : "+obj1.weight);

    }
}
