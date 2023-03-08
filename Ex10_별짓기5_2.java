import java.util.Scanner;

public class Ex10_별짓기5_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 별찍기 개수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
