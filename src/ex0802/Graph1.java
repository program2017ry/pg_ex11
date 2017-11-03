package ex0802;

public class Graph1 {
	public static void main(String[] args) {
		for (int i = -8; Math.abs(i) <= 8; i++) {
			printGraph(i * i);
		}
	}

	public static void printGraph(int x) {
		for (int i = 0; i < x; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}

}
