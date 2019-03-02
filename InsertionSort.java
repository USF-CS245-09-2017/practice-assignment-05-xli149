/** This is the algorithm for Insertion Sort.
 * @author Chris Li
 */
public class InsertionSort implements SortingAlgorithm{
	//constructor
	public InsertionSort(){

	}
	/**
	 * This function implemented the sort function in SortingAlgorithm inference
	 * for sorting the array by Insertion Sort.
	 * @param a is the array to be sorted
	 */
	public void sort(int[] a){
		for(int i = 1; i < a.length; i++){
			int temp  = a[i];
			int j = i - 1;
			while(j >=0 && a[j] > temp){
				a[j+1] = a [j];
				j--;
			}
			a[j+1] = temp;
		}
	}

}