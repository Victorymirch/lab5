import java.util.Scanner;

public class timus1131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long K = scanner.nextLong();
        scanner.close();

        long currentComputers = 1;
        long hours = 0;

        while (currentComputers < N && currentComputers < K) {
            currentComputers *= 2;
            hours++;
        }

        if (currentComputers < N) {
            long remainingComputers = N - currentComputers;
            hours += (remainingComputers + K - 1) / K;
        }


        System.out.println(hours);
    }
}
