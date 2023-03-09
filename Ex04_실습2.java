package ex1103;

public class Ex04_실습2 {

	public static void main(String[] args) {

		// 1. 임의의 값으로 정수형 배열 초기화 -> {정수, 정수, 정수}
		int[] intArray = { 1, 3, 5, 7, 9 };

		// 2. 홀수인 것만 출력, 홀수의 개수(cnt)도 출력

		int cnt = 0;

		System.out.print("intArray에 들어있는 홀수는 ");

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 == 1) {
				System.out.print(intArray[i] + " ");
				cnt += 1;

			}

		}
		System.out.println("입니다." + " 홀수의 총 개수는 " + cnt + "입니다");
	}

}
