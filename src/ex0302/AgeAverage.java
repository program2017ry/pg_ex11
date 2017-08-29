package ex0302;

public class AgeAverage {
	public static void main(String[] args){
		System.out.println("1人目の名前を入力してください。");
		String name1 = new java.util.Scanner(System.in).nextLine();
		System.out.println(name1 + "の年齢を入力してください。");
		int nenrei1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("2人目の名前を入力してください。");
		String name2 = new java.util.Scanner(System.in).nextLine();
		System.out.println(name2 + "の年齢を入力してください。");
		int nenrei2 = new java.util.Scanner(System.in).nextInt();
		double ageAverage = (nenrei1 + nenrei2) / 2.0;
		System.out.println("2人の平均年齢は" + ageAverage);
	}

}
