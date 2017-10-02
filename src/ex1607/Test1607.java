package ex1607;

class ast implements Runnable {
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

class eq implements Runnable {
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

public class Test1607 {
	public static void main(String[] args) {
		ast ct = new ast();
		Thread th = new Thread(ct);
		th.start();

		eq ct1 = new eq();
		Thread th1 = new Thread(ct1);
		th1.start();
	}
}
