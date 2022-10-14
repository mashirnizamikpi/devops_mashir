package Public_Thread;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Comparison implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
		
	}

		Integer maxInt(List<Integer> num) {

			Integer max = num.stream().max(Comparator.comparing(i -> i)).get();
			System.out.println("Minimum number  is " + max);

			return max;

		}

		Integer minInt(List<Integer> num) {

			Integer min = num.stream().min(Comparator.comparing(i -> i)).get();
			System.out.println("Maximum number is " + min);

			return min;

		}
	public static void main(String args[]) throws InterruptedException {
		

		List<Integer> num = new ArrayList<Integer>();
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		num.add(16);
		num.add(17);
		num.add(18);
		num.add(19);
		num.add(20);
		
		Runnable r1 = new Comparison(); 
		Comparison mm = new Comparison();
		
		Thread th1 = new Thread(r1, "My First thread");  //First Thread 
		th1.start();
		mm.maxInt(num);
		Long duration = (long)(Math.random()*5);
		TimeUnit.SECONDS.sleep(duration);
		Thread th2 = new Thread(r1, "My Second thread"); //Second Thread
		th2.start();
		
		mm.minInt(num);

		    

	}




}



