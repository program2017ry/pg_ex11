package ex1605;

public class CountTen3 extends Thread {
	public static void main (String[] args) {
		for (int j = 0; j < 3; j ++) {
			CountTen3 ct = new CountTen3();
			ct.start();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("main:i = " + i + " by " + currentThread().getName());
		}
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i ++) {
			System.out.println("run:i = " + i + " by " + getName());
		}
	}
}
