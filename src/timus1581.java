import java.util.Scanner;

public class timus1581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (numbers[i] == numbers[i - 1]) {
                count++;
            } else {
                result.append(count).append(" ").append(numbers[i - 1]).append(" ");
                count = 1;
            }
        }


        result.append(count).append(" ").append(numbers[n - 1]);

        System.out.println(result.toString().trim());
    }
}
