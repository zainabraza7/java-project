import java.util.Scanner;
public class ques_01 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the sum of obtained marks: ");
            double obtainedMarks = sc.nextDouble();


            System.out.print("Enter the maximum marks: ");
            double maximumMarks = sc.nextDouble();

            double percentage = (obtainedMarks * 100) /maximumMarks;

            System.out.println("Percentage Marks = " + percentage + "%");

            sc.close();
        }

}
