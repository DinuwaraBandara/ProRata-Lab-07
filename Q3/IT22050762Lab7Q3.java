
import java.util.Scanner;

public class IT22050762Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double DISCOUNT_RATE = 0.05;

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("Customer " + customer);

            System.out.print("Enter bill amount: ");
            double billAmount = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            String paymentMode = input.next();

            while (!paymentMode.equalsIgnoreCase("C") &&
                   !paymentMode.equalsIgnoreCase("O")) {

                System.out.println("Payment Mode is Not Valid");

                System.out.print("Enter payment mode (C/O): ");
                paymentMode = input.next();
            }

            double discount = 0;

            if (paymentMode.equalsIgnoreCase("C")) {
                discount = billAmount * DISCOUNT_RATE;
            }

            double finalAmount = billAmount - discount;

            System.out.println("Discount: Rs. " + discount);
            System.out.println("Amount to be paid: Rs. " + finalAmount);
            System.out.println();
        }

        input.close();
    }
}

