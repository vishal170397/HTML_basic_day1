package Teaching;


class Book implements Runnable{
	@Override
	public void run()
	{
		System.out.println("do a task");
	}
}
public class ThreadRunnable {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//Book b1=new Book();
		Thread t1=new Thread (new Book(),"book thread");
		t1.start();
		System.out.println("Thread with name"+" "+t1.getName());
	}
}