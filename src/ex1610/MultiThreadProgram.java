package ex1610;

public class MultiThreadProgram {
	Job[] jobs;
	public MultiThreadProgram(int jobcount) {
		jobs = new Job[jobcount];
		for(int i = 0; i < jobcount; i++) {
			jobs[i] = new Job(i);
		}
	}
	public void workAllJobs() {
		for (int i = 0; i < jobs.length; i++) {
			jobs[i].work();
		}
	}
	public static void main(String[] args) {
		MultiThreadProgram self =  new MultiThreadProgram(10);
		while(true) {
			self.workAllJobs();
		}
	}

}
