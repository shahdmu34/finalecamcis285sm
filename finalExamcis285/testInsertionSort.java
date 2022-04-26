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
	 public void testPositive(){
	        int[] arr = new int[5];
	        arr[0] = 8;
	        arr[1] = 9;
	        arr[2] = 6;
	        arr[3] = 1;
	        arr[4] = 10;

	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = 1;
	        Sortedarr[1] = 6;
	        Sortedarr[2] = 8;
	        Sortedarr[3] = 9;
	        Sortedarr[4] = 10;
	        int[] result = new InsertionSort().basicInsertionSort(arr);
	        assertArrayEquals(Sortedarr, result);
}
	  public void testNegative(){
	    	 int[] arr = new int[5];
	         arr[0] = -8;
	         arr[1] = -9;
	         arr[2] = -6;
	         arr[3] = -1;
	         arr[4] = -10;

	         int[] Sortedarr = new int[5];
	         Sortedarr[0] = -10;
	         Sortedarr[1] = -9;
	         Sortedarr[2] = -8;
	         Sortedarr[3] = -6;
	         Sortedarr[4] = -1;
	         int[] result = new InsertionSort().basicInsertionSort(arr);
		    assertArrayEquals(Sortedarr, result);
	  }
	  
}
