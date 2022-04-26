package finalExamcis285;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testInsertionSort {

	@Test
	public void test() {

		testPositive();
		testNegative();
		testMixed();

	}
	 public testInsertionSort() {
	    }
	 
	   public void testMixed(){
	    	 int[] arr = new int[5];
	         arr[0] = -9;
	         arr[1] = -7;
	         arr[2] = 2;
	         arr[3] = 8;
	         arr[4] = 10;

	         int[] Sortedarr = new int[5];
	         Sortedarr[0] = -9;
	         Sortedarr[1] = -7;
	         Sortedarr[2] = 2;
	         Sortedarr[3] = 8;
	         Sortedarr[4] = 10;
	         int[] result = new InsertionSort().basicInsertionSort(arr);
			    assertArrayEquals(Sortedarr, result);
		  }
}
