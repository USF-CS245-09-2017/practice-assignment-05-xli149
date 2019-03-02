public class QuickSort implements SortingAlgorithm {
	public QuickSort(){

	}
	public void sort(int[] a){
		quickSort(a, 0, a.length - 1);
	}	
	public void quickSort(int[] a, int left, int right){
		if(left < right){
			int p = partition(a, left, right);
			quickSort(a, left, p - 1);
			quickSort(a, p+1, right);
		}
	}	
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
	public void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
