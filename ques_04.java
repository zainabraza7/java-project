import java.util.Scanner;
public class ques_04 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter discounted selling price: ");
            double dsp = sc.nextDouble();

            System.out.print("Enter discount percentage: ");
            double dp = sc.nextDouble();
//DSP = OP − (OP × DP / 100)
//DSP = OP × (1 − DP/100)
//OP = DSP / (1 − DP/100)


            double originalPrice = dsp / (1 - dp / 100);

            System.out.println("Original Selling Price" + originalPrice);

            sc.close();
        }


}
