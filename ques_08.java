import java.util.Scanner;

public class ques_08 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter length of side a: ");
            double a = sc.nextDouble();

            System.out.print("Enter length of side b: ");
            double b = sc.nextDouble();

            System.out.print("Enter length of side c: ");
            double c = sc.nextDouble();

            double s = (a + b + c) / 2; //semi-perimeter calculate


            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); //heron's formula for area

            System.out.println("Area of the triangle is: " + area);

            sc.close();
        }


}
