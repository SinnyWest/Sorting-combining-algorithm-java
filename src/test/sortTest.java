package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class sortTest {
	
	@Test
	public void testNullInput() {
		
		int[] a = null;
		
		int[] b = null;
		
		assertTrue(Sort.combineArrays(a, b) == -1);
	}

}
