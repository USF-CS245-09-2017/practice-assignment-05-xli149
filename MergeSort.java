public class MergeSort implements SortingAlgorithm {
	public MergeSort(){

	}
	public void sort(int[] a){
		mergeSort(a);
	}
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
	public int[] getLeft(int[] a){
		int[] left = new int[a.length/2];
		for(int i = 0; i < left.length; i++){
			left[i] = a[i];
		}
	

		return left;
	}
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
