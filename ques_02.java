import java.util.Scanner;
public class ques_02 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();

            double circumference = 2 * Math.PI * radius; //java mai maths pi use hota
            double area = Math.PI * radius * radius;

            System.out.println("Circumference of the circle = " + circumference);
            System.out.println("Area of the circle = " + area);

            sc.close();
        }


}
