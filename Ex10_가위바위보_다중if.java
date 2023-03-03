import java.util.Scanner;

public class Ex10_가위바위보_다중if {

	public static void main(String[] args) {

		// 가위바위보 프로그램 만들기
		Scanner sc = new Scanner(System.in);

		// user1, user2 이름 입력받기
		System.out.print("USER1 : ");
		String user1 = sc.next();

		System.out.print("USER2 : ");
		String user2 = sc.next();

		// user1, user2 가 낸 가위 바위 보 입력받기
		System.out.print(user1 + "님 >> ");
		String rsp1 = sc.next();

		System.out.print(user2 + "님 >> ");
		String rsp2 = sc.next();

		// String(문자열)을 같다고 비교할 때 -> .equals() 사용
		// 비교할문자열1.equals(비교할문자열2)
		if (rsp1.equals(rsp2)) {
			System.out.println("무승부~");
		} else if (rsp1.equals("가위")) {

			if (rsp2.equals("보")) {
				System.out.println(user1 + "님 승리!");
			} else {
				System.out.println(user2 + "님 승리!");
			}

		} else if (rsp1.equals("바위")) {

			if (rsp2.equals("보")) {
				System.out.println(user2 + "님 승리!");
			} else {
				System.out.println(user1 + "님 승리!");
			}

		} else if (rsp1.equals("보")) {

			if (rsp2.equals("가위")) {
				System.out.println(user2 + "님 승리!");
			} else {
				System.out.println(user1 + "님 승리!");
			}

		}

	}

}
