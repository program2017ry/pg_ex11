package ex1610;

public class MultiThreadProgram {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			JobThread jt = new JobThread(i);
			jt.start();
		}
	}
}

class JobThread extends Thread {
	Job job;
	public void run(){
		while(true) {
			job.work();
		}
	}
	public JobThread(int num){
		job = new Job(num);
	}
}
