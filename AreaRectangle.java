import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        System.out.println("Enter Width And Height");
        Scanner scn = new Scanner(System.in);
        int width = scn.nextInt();
        int height = scn.nextInt();
        int area = areaRectangle(width,height);
        System.out.println(area);

    }
    private static int areaRectangle(int width, int height){
        return(width*height);
    }
}
