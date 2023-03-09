package ex1103;

public class Ex05_실습3_feat_주희쌤 {

	public static void main(String[] args) {

		int[] array = { -2, -5, -4, -8, -32, -16, -10 };
		int max = array[0];

		System.out.print("가장 큰 수는 ");
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.print(max + "입니다.");

	}

}
