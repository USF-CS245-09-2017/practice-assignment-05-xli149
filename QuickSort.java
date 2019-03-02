/** This is the algorithm for Quick Sort.
 * @author Chris Li
 */
public class QuickSort implements SortingAlgorithm{
	//Constructor
	public QuickSort(){

	}
	/**
	 * This function implemented the sort function in SortingAlgorithm inference
	 * and call the quickSort() function below.
	 * @param a is the array to be sorted
	 */
	public void sort(int[] a){
		quickSort(a, 0, a.length - 1);
	}	
	/**
	 * Recursive quickSort function.
	 * @param a is the array to be sorted
	 * @param left the lowest index of the array
	 * @param right the highest index of the array
	 */
	public void quickSort(int[] a, int left, int right){
		if(left < right){
			int p = partition(a, left, right);
			quickSort(a, left, p - 1);
			quickSort(a, p+1, right);
		}
	}
	/**
	 * This functrion is for findig the index of pivot
	 * @param a is the array to be sorted
	 * @param left the lowest index of the array
	 * @param right the highest index of the array
	 */
	public int partition(int[] a, int left, int right){
		if(left < right){
			int pivot = left;
			int i = left + 1;
			int j = right;
			while(i < j){
				while(i <= right && a[i] <= a[pivot]){
					i++;
				}
				while(j >= i && a[j] > a[pivot]){
					j--;
				}
				if(i <= right && i < j){
					swap(a, i, j);
				}
			}
			swap(a, pivot, j);
			return j;
		}
		return left;
	} 
	/**
	 * Swap function
	 * @param a is the array to be sorted
	 * @param j the index of the item to be swapped
	 * @param i the index of the item to be swapped
	 */ 
	public void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}