package _04_Thread_Pool;

public class ThreadPoolsTester {
public static void main(String[] args) {
	WorkQueue wq = new WorkQueue();
	for (int i = 0; i < 1000; i++) {
		int x = i;
		Job j = ()->{
			System.out.println("Printing " + x + " from thread #" + Thread.currentThread().getId());
				
		};
		wq.addJob(j);
	}
	wq.shutdown();
	System.out.println("Total threads: " + wq.getThreadCount());
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	wq.shutdown();
}
}
