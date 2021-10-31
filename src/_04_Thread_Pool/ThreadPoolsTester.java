package _04_Thread_Pool;

public class ThreadPoolsTester {
public static void main(String[] args) {
	WorkQueue wq = new WorkQueue();
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
