import java.util.Scanner;

public class B8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();  // 테스트 케이스 수 입력
        sc.nextLine();  // 줄바꿈 문자 제거

        for (int i = 0; i < testCase; i++) {
            String line = sc.nextLine();  // OX 문자열 입력

            int score = 0;  // 현재 연속된 O의 점수
            int sum = 0;    // 총 점수

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'O') {
                    score++;       // 연속된 O면 점수 누적
                    sum += score;
                } else {
                    score = 0;     // X 나오면 누적 초기화
                }
            }

            System.out.println(sum);  // 결과 출력
        }
    }
}
