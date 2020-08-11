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

		@Test
		public void multiplikation () {

			TaschenrechnerOlli meinTaschenrechner = new TaschenrechnerOlli ();

			double aArray []= {-2, 3, -5, 6, -1, -2, 1};
			
			double bArray [] = {-8, 7, 4, -6, 3, 3, -2};
			

			
			for (double aWert: aArray) {
				System.out.println("==> a:" + aWert);
				
			for (double bWert: bArray) {
				System.out.println("\n" + "==> " + aWert + "*" + bWert );				
				System.out.println("=" + aWert * bWert);
			}	
		}
	}
}

