import java.util.Scanner;
public class ques_03 {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter original price: ");
            double op = sc.nextDouble();

            System.out.print("Enter discount percentage: ");
            double dp = sc.nextDouble();

            double discountedPrice = op - (op * dp / 100);

            System.out.println("Discounted Price" + discountedPrice);

            sc.close();
        }


}
