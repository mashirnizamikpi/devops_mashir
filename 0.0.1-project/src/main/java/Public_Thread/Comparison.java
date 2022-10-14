package Public_Thread;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Comparison {
	
	public Integer maxInt() {
		
		   List<Integer> ints = Stream.of(1,2,4,3,5,9,11,15,21,22).collect(Collectors.toList());
		    Integer maxInt = ints.stream()
		                              .max(Comparator.comparing(i -> i))
		                              .get();
		   
		     
		    
		    return maxInt;
		    }
	
	public Integer minInt() {
		
		   List<Integer> ints = Stream.of(1,2,4,3,5,9,11,15,21,22).collect(Collectors.toList());
		  
		   
		    Integer minInt = ints.stream()
              .min(Comparator.comparing(i -> i))
              .get();
		    
		    
		    return minInt;
		    }
	
	public static void main(String args[]) {
		Comparison co = new Comparison();
		co.maxInt();
		co.minInt();

		    
		   

		    

	}

}



