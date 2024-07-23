public class DowhileLoops {
    public static void main(String[] args){
        int i = 10;
        int sum = 0;

        do {
            System.out.println(i);
            i--;
            sum+=i;
            
            
        } while ( i>=1);

        String input = ((sum%2==0))?"Even":"Odd";
        System.out.println(input);
        
    }
    
}
