package Teaching;

class ThreadImplementation  implements Runnable{
	private boolean exit1;
	private String name;
	Thread t;
	ThreadImplementation(String threadname){
		name = threadname;
		t = new Thread(this.name);
		System.out.println("New Thread"+t);
		exit1 = false; //If there is no thread it will exits
		t.start(); //If thread is live
	}
	public void run() {
		int i = 0;
		while(exit1)
		{
			System.out.println(name+ " :"+i);
			i++;
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {
				System.out.println("Caught"+e);
			}
		}
		System.out.println(name +"Stopped");
	}
	public void stop()
	{
		exit1 = true;
	}
	public class ThreadImlementation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadImplementation t1 = new ThreadImplementation("First Thread");
		ThreadImplementation t2 = new ThreadImplementation("Second Thread");
		try {
			Thread.sleep(200);
			t1.stop();
			t2.stop();
			Thread.sleep(200);
	//Note thread only can specify the sleep timings rather than object
	//variables
		}
		catch(InterruptedException e) {
			System.out.println("Caught" +e);
		}
		System.out.println("Exit the main thread");
	}
	}
}