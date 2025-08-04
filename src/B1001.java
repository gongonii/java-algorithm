import java.util.Scanner;

public class B1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자 입력: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자 입력: ");
        int num2 = sc.nextInt();

        System.out.println("결과: " + (num1 - num2));
    }
}
