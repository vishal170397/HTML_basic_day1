package Teaching;

 class Threading extends Thread {

	 
	 public static void main(String[] args) {
		 //TODO Auto-generated method stub
		 Threading tp=new Threading();
		 tp.start();//thread starts
		 
		 System.out.println("The code is running outside the thread");
	 }
	 public void run()//once thread started enters into run()
	 {
		 System.out.println("The code is running inside the thread");
	 }
}
