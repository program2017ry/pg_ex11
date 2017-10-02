package ex1611;

public class OneBankTest extends Thread {
	OneBank bank;
	public OneBankTest(OneBank bank) {
		this.bank = bank;
	}
	@Override
	public void run() {
		while(true) {
			OneBank.addMoney(100);
			OneBank.addMoney(-100);
		}
	}
	public static void main(String[] args) {
		OneBank bank = new OneBank();
		new OneBankTest(bank).start();
		new OneBankTest(bank).start();
	}
}