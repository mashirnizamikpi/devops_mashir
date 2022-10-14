package Public_Thread;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComparisonTest {
	


		@Test
		public void evaluatesExpression() {

			Comparison co = new Comparison();
			
			int base = co.maxInt();
			int red = co.minInt();
			

			assertEquals(22, base);
			assertEquals(1, red);
	

		}

	}

