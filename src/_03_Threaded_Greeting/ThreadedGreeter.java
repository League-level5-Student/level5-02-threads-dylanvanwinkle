package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{
int counter;

ThreadedGreeter(int x){
	this.counter = x;
}	
public static void main(String[] args) {
	
}
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + counter);
		if (counter <= 50) {
			Thread t1 = new Thread(new ThreadedGreeter(counter + 1));
			t1.start();
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
