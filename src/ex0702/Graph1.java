package ex0702;

public class Graph1 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10){
			int j = 0;
			while(j < (i * i)){
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}