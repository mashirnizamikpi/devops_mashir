package Public_Thread;


public class Assign implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}
	
	
	public static void main(String args[]) {
	Runnable r1 = new Assign();   
	  
	
	Thread th1 = new Thread(r1, "My First thread");   
	th1.start();
	Thread th2 = new Thread(r1, "My Second thread"); 
	th2.start();
	
 
	}
}

 





		
		



