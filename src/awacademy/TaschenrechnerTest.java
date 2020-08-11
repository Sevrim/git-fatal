package awacademy;

import org.junit.Assert;
import org.junit.Test;

public class TaschenrechnerTest {

		@Test
		public void zehnGeteiltDurchFuenf () {
						
			TaschenrechnerOlli meinTaschenrechner = new TaschenrechnerOlli ();
			
			double ergebnis = meinTaschenrechner.divide(10,5);

			Assert.assertEquals(2, ergebnis, 0.005);
				
		}
		
		@Test
		public void zweiPlusZwei () {
						
			TaschenrechnerOlli meinTaschenrechner = new TaschenrechnerOlli ();
			
			double ergebnis = meinTaschenrechner.plus(2,2);

			Assert.assertEquals(4, ergebnis, 0.005);

		}
		
		@Test
		public void zweiMinusZwei () {
		
			TaschenrechnerOlli meinTaschenrechner = new TaschenrechnerOlli ();
		
			double ergebnis = meinTaschenrechner.minus(2,2);

			Assert.assertEquals(0, ergebnis, 0.005);
		
		}
		
		@Test
		public void zweiMalZwei () {
		
			TaschenrechnerOlli meinTaschenrechner = new TaschenrechnerOlli ();

			double ergebnis = meinTaschenrechner.mal(2,2);

			Assert.assertEquals(4, ergebnis, 0.005);

		}
		
		@Test
		public void maxIntegerPlusEins () {
		
			int maxIntegerPlusEins 	= Integer.MAX_VALUE + 1;
		
			System.out.println(maxIntegerPlusEins);	
				
		}
	}


