package ex0403;

public class Aisatsu {
	public static void main(String[] args){
		System.out.println("現在の時刻を入力してください");
		int time = new java.util.Scanner(System.in).nextInt();
		if ((0 <= time) && (time <= 11)){
			System.out.println("おはようございます");
		}
		else if (time == 12){
			System.out.println("お昼です");
		}
		else if ((13 <= time) && (time <= 18)){
			System.out.println("こんにちは");
		}
		else if ((19 <= time) && (time <= 23)){
			System.out.println("こんばんは");
		}
		else {
			System.out.println("時刻の範囲を超えています");
		}
	}
}
