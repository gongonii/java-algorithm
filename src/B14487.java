import java.util.Arrays;
import java.util.Scanner;

public class B14487 {
    public static void main(String[] args) {
        int n;
        int distance;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        distance = 0;
        Arrays.sort(arr); //Arrays.sort(arr, Collections.reverseOrder()); 내림차순

        for(int i =0; i<n-1; i++){
            distance+=arr[i];

        }
        System.out.println(distance);

    }
}
