public class IT22050762Lab7Q2B {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            System.out.print(row + "-");

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
