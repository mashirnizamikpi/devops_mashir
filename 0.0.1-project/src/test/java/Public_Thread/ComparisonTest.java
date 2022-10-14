package Public_Thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ComparisonTest {

	@Test
	public void check() {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(34);
		num.add(54);
		num.add(56);
		num.add(78);
		num.add(77);
		num.add(78);
		num.add(45);
		num.add(88);
		num.add(34);
		
		Comparison mm = new Comparison();
		
		Integer a = mm.maxInt(num);
		assertEquals(88, a.intValue());
		
		Integer b = mm.minInt(num);
		assertEquals(1, b.intValue());
		
		
	}
	
}
