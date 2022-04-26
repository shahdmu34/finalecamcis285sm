package finalExamcis285;

public class InsertionSort {
	 
	public InsertionSort() {
		
	}
	
	public int[] basicInsertionSort(int array[]) {
		    int size = array.length;

		    for (int step = 1; step < size; step++) {
		      int key = array[step];
		      int j = step - 1;

		      
		      while (j >= 0 && key < array[j]) {
		        array[j + 1] = array[j];
		        --j;
		      }

		      array[j + 1] = key;
		    }
		    return array;
		  }

		
		}

