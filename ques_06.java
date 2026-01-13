import java.util.Scanner;
public class ques_06 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the length of the first parallel side: ");
            double a = sc.nextDouble();

            System.out.print("Enter the length of the second parallel side: ");
            double b = sc.nextDouble();

            System.out.print("Enter the height: ");
            double h = sc.nextDouble();

            double area = h * (a + b) / 2;

            System.out.printf("The area of the trapezium is: %.2f%n", area);

            sc.close();

        }

}
