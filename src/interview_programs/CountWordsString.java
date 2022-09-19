package interview_programs;

public class CountWordsString {

    public static void main(String[] args) {


        String str= "This is java Programming";

        String [] strings= str.split(" ");

        System.out.println("Total word is  :" +strings.length);

        int total_count=0;

        for (int i=0; i<str.length(); i++){

            System.out.println(str.charAt(i));
            total_count=total_count+1;

        }

        System.out.println("Number of total char is :"+total_count);
    }
}
