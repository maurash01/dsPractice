import java.util.Random;

public class GenerateOTP {
    public static void main(String[] args) {
        Random random = new Random();
        // To store the random number 
        int  myotp = random.nextInt(1000000);
        System.out.println("Your OTP is : "+ myotp);
    }
    
}
