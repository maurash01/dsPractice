import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();
        System.out.println("My Age is : " + age);

        String output = ((age>=18))? "eligible":"Not Eligible";
        System.out.println(output);

    }
    
}
