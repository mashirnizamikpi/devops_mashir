package Public_Thread;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Comparison implements Runnable{
	
	public Integer maxInt() {
		
		   List<Integer> ints = Stream.of(1,2,4,3,5,9,11,15,21,22).collect(Collectors.toList());
		    Integer maxInt = ints.stream()
		                              .max(Comparator.comparing(i -> i))
		                              .get();
		   
		     
		    System.out.println("Greatest Number is "+maxInt);
		    return maxInt;
		    }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("Thread is running");
		
	}

	
	public Integer minInt() {
		
		   List<Integer> ints = Stream.of(1,2,4,3,5,9,11,15,21,22).collect(Collectors.toList());
		  
		   
		    Integer minInt = ints.stream()
              .min(Comparator.comparing(i -> i))
              .get();
		    System.out.println("Min Number is "+minInt);
		    
		    return minInt;
		    }
	
	public static void main(String args[]) throws InterruptedException {
		
		Runnable r1 = new Comparison(); 
		Comparison co = new Comparison();
		
		Thread th1 = new Thread(r1, "My First thread");  //First Thread 
		th1.start();
		co.maxInt();
		Long duration = (long)(Math.random()*5);
		TimeUnit.SECONDS.sleep(duration);
		Thread th2 = new Thread(r1, "My Second thread"); //Second Thread
		th2.start();
		co.minInt();

		    
		   

		    

	}


}



