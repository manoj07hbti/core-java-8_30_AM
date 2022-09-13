package methods;

public class CalCInputParam {

    public void add(int a, int b){

       int result=a+b;
       System.out.println("SUM of a and b is : "+result);
    }

    // sub, multi , divide
    public static void main(String[] args) {

        CalCInputParam obj= new CalCInputParam();
        obj.add(34,32);
        obj.add(23,45);

    }
}
