package ex1603;

class LabelPrinter extends Thread {
	String label = "no label";
	LabelPrinter(String label) {
		this.label = label;
	}
	@Override
	public void run() {
		while (true) {
			// なんでwhile文いれるの？？？？？？？？
			System.out.println(label);
			try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class PrintHello3 {
	public static void main(String[] args) {
		LabelPrinter th = new LabelPrinter("おはよう！");
		th.start();

		LabelPrinter th1 = new LabelPrinter("こんにちは！");
		th1.start();

		LabelPrinter th2 = new LabelPrinter("こんばんわ！");
		th2.start();
	}

}
