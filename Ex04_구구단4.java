
public class Ex04_구구단4 {

	public static void main(String[] args) {

		// for문안에 for문

		for (int k = 2; k <= 9; k++) {

			System.out.println("==" + k + "단" + "==");
			for (int i = 1; i <= 9; i++) {
				System.out.println(k + "*" + k * i);
			}
			System.out.println();

		}

//		System.out.println("==2단==");
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(2 + "*" + 2 * i);
//		}
//
//		System.out.println("==3단==");
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(3 + "*" + 3 * i);
//
//		}

	}
}