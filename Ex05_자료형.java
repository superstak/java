package ex1028;

public class Ex05_자료형 {

	public static void main(String[] args) {

		// 1. 논리형
		// boolean : 1bit or 1byte (1과 0)
		// 참 혹은 거짓 (ture or false)
		// 1byte = 8bit = 2^8 = 256가지

		// 지금 더운 상태를 저장하는 변수
		boolean isHot = false; // true
		System.out.println(isHot);

		// 2. 문자형
		// char : 2byte = 2^16 = 65536경우
		// -> 모든 유니코드 문자 표현 가능
		char grade = 'A';
		char num = '4'; // 문자취급
		char single = '\''; // \t(탭), \n(엔터)

		// 3. 정수형
		// byte (-128 ~ 127)
		byte age = 20;
		// short (약 -30000 ~ 30000)
		short lunch = 7000;
		// int
		int account = 2000000000;
		// long
		long microbe = 1000000000000000L;

		// 4. 실수형
		// float
		float height = (float) 164.4; // 164.4f 도 가능
		// double
		double a = 123456789.123456789;

		char A = '이';
		char B = '주';
		char C = '희';
		System.out.print(A);
		System.out.print(B);
		System.out.println(C);

		// 레퍼런스 타입 : 기본 데이터 타입 8개 이외의 타입
		// 자바 책 : 65p
		// 문자열을 담는 타입 -> String
		String name = "이주희";
		System.out.println("나의 이름은 " + "이주희");

	}
	
	default

}
