
import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your CGPA : ");
        float cgpa=sc.nextFloat();
        System.out.println("The Percentage for "+cgpa+" CGPA is "+(cgpa*9.5));
        }
}
