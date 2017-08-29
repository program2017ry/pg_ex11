package ex0303;

public class MojiCode {
	public static void main(String[] args){
		System.out.println("文字列を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		for (int i = 0; i < name.length(); i++){
			char code = name.charAt(i);
			System.out.println("'" + code + "'の文字コードは" + (int)code + "です。");
		}
	}

}
