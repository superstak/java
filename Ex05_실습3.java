package ex1103;

public class Ex05_실습3 {

	public static void main(String[] args) {

		// 최대값
		int[] array = { 4, 8, 32, 16 };
		int max = 0;

		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.print("가장 큰 수는 " + max + "입니다.");

		// 최소값

		System.out.println();

		int[] array2 = { 4, 8, 32, 16 };
		int min = array2[0];

		for (int i = 0; i < array2.length; i++) {

			if (min > array2[i]) {
				min = array2[i];
			}

		}
		System.out.println("가장 작은 수는 " + min + "입니다.");

	}

}
