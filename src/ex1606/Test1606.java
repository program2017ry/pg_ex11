package ex1606;

class ast extends Thread {
	@Override
	public void run() {
			for (int i = 0; i < 10; i++) {
				try {
				Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
				System.out.println("***");
			}
	}
}

class eq extends Thread {
	@Override
	public void run() {
			for (int i = 0; i < 10; i++) {
				try {
				Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				System.out.println("====");
			}
	}
}

public class Test1606 {
	public static void main(String[] args) {
		ast th = new ast();
		th.start();

		eq th1 = new eq();
		th1.start();
	}
}
