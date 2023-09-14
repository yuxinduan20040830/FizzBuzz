public class Multiples {
    public static void main(String[] args) {

        int num = 0;

        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                num += 1;

            } else if (divisibleBy3) {

                num += 1;

            } else if (divisibleBy5) {

                num += 1;

            }
        }

        System.out.println(num);

    }
}
