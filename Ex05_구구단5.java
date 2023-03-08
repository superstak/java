
public class Ex05_구구단5 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.print(i + "단 : ");
			for (int k = 1; k <= 9; k++) {
				System.out.print(i + "*" + k + "=" + i * k + "\t");
			}

			System.out.println();
		}

	}

}
