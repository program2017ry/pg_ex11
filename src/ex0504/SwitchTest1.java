package ex0504;

public class SwitchTest1 {
	public static void main (String[] args) {
		int n = 2;

		switch (2 * n + 1) {
		case 1:
			System.out.println("オレンジジュースです");
			break;

		case 2:
			System.out.println("コーヒーです");
			break;

		case 3:
			System.out.println("ミルクです。");
			break;

		default:
			System.out.println("どれでもありません。");
			break;
		}
	}

}
