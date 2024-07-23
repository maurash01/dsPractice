public class Loops1 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i=10; i>=1;i--){
            System.out.println(i);
            sum += i ;
        }
        System.out.println("The sum of first 10 natural nos." + sum);
    }
    
}
