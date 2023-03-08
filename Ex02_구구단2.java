import java.util.Scanner;

public class Ex02_구구단2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 내가 원하는 단 출력하기

		System.out.print("단 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + "=" + num * i);

		}

	}

}
