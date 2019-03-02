/** This is the algorithm for Merge Sort.
 * @author Chris Li
 */
public class MergeSort implements SortingAlgorithm{
	//Constructor
	public MergeSort(){

	}
	/**
	 * This function implemented the sort function in SortingAlgorithm inference
	 * and call the mergeSort() function below.
	 * @param a is the array to be sorted
	 */
	public void sort(int[] a){
		mergeSort(a);
	}
	/**
	 * Recursive mergeSort function.
	 * @param a is the array to be sorted
	 */
	public void mergeSort(int[] a){
		if(a.length  <=  1){
			return; 
		}
			int[] left = getLeft(a);
			int[] right = getRight(a);
			mergeSort(left);
			mergeSort(right);
			merge(a, left, right);
		
	}
	/** This function is for getting the left part of the array
	 * @param a is the array to be partitioned.
	 */
	public int[] getLeft(int[] a){
		int[] left = new int[a.length/2];
		for(int i = 0; i < left.length; i++){
			left[i] = a[i];
		}
		return left;
	}
	/** This function is for getting the right part of the array
	 * @param a is the array to be partitioned.
	 */
	public int[] getRight(int[] a){
		int[] right ;
		if(a.length % 2 == 0){
			right = new int[a.length/2];
			
		}
		else{
			right = new int[a.length/2 + 1];
			
		}
		for(int i = 0; i < right.length; i++){
				right[i] = a[a.length/2 + i];

			}
		return right;

	}
	/** This function is for merging the two parts of an array
	 * into one array in order.
	 * @param a is the array to be merged into
	 * @param left is the left part of the array
	 * @param right is the righr part of the array
	 */
	public void merge(int[] a, int[] left, int[] right){
		int a_i = 0;
		int left_i = 0;
		int right_i = 0;
		while(left_i < left.length && right_i < right.length){
			if(left[left_i] <= right[right_i]){
				a[a_i] = left[left_i];
				a_i++;
				left_i++;
			}
			else{
				a[a_i] = right[right_i];
				a_i++;
				right_i++;
			}
		}
		while(left_i < left.length ){
			a[a_i++] = left[left_i++];
		}
		while(right_i < right.length){
			a[a_i++] = right[right_i++];
		}
	}
}