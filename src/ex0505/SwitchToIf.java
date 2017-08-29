package ex0505;

public class SwitchToIf {
	public static void main (String[] args) {
		char c = 'a';
		if ((c == 'a') || (c == '1')){
			System.out.println("オレンジジュースです。");
		}
		else if ((c == 'b') || (c == '2')){
			System.out.println("コーヒーです。");
		}
		else {
			System.out.println("どちらでもありません。");
		}
	}


}
