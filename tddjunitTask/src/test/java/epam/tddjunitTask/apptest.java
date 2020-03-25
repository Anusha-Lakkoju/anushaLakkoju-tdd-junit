/**
 * 
 */
package epam.tddjunitTask;

import org.junit.Test;

import junit.framework.TestCase;

public class apptest extends TestCase {
	/*
	 * TODO list 
	 * 1. ABCD => BCD 	-success
	 * 2. AACD => CD	-success
	 * 3. BACD => BCD	-success
	 * 4. BBAA => BBAA	-success
	 * 5. AABAA => BAA	-success
	 * 6. ABACD => BACD`-success
	 * 7. AA => " "		-success
	 */
	
	@Test
	public void test1() {
		DeleteFirst2As deleteFirst2As = new DeleteFirst2As();
		assertEquals("BCD" , deleteFirst2As.delete("ABCD"));
	}
	@Test
	public void test2() {
		DeleteFirst2As deleteFirst2As = new DeleteFirst2As();
		assertEquals("CD" , deleteFirst2As.delete("AACD"));
	}
	@Test
	public void test3() {
		DeleteFirst2As deleteFirst2As = new DeleteFirst2As();
		assertEquals("BCD" , deleteFirst2As.delete("BACD"));
	}
	@Test
	public void test4() {
		DeleteFirst2As deleteFirst2As = new DeleteFirst2As();
		assertEquals("BBAA" , deleteFirst2As.delete("BBAA"));
	}
	@Test
	public void test5() {
		DeleteFirst2As deleteFirst2As = new DeleteFirst2As();
		assertEquals("BAA" , deleteFirst2As.delete("AABAA")); 
	}

}
