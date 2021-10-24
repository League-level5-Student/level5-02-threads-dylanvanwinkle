package _04_Thread_Pool;

public class WorkQueue implements Runnable{
private Thread[] threads;

public workQueue() {
	int totalThreads = Runtime.getRuntime().availableProcessors() - 1;
	threads = new Thread[totalThreads];
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

public int getThreadCount()	{
	return threads.length;
}
	
}
