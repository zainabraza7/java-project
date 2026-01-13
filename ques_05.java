import java.util.Scanner;
public class ques_05 {

     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter voltage (Volts): ");
            double volt = sc.nextDouble();

            System.out.print("Enter current (Amperes): ");
            double amp = sc.nextDouble();

            double watt = volt * amp;

            System.out.println("Power Consumption (Watts)" + watt);

            sc.close();
        }


}
