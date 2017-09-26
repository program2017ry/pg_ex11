package ex0906;

public class SelectGreeting {
	public static void main(String[] args){
		String[] message = new String[3];
		message[0] = "おはよう！";
		message[1] = "こんにちは！";
		message[2] = "こんばんは！";

		if (args.length != 1){
			System.out.print("使い方： java SelectGreeting 番号");
			System.exit(0);
		}
		int num = Integer.parseInt(args[0]);	//引数を受け取る
		if(0 <= num && num < message.length) {
			System.out.print(message[num]);
		} else {
			System.out.print("番号は0～" + 2 + "の範囲で指定してください。");
		}
	}

}
