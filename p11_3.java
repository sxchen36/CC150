package CC150;

public class p11_3 {
	
	/*Correct but O(n) because of finding the interruption point
	 * Can do better: Interruption between two numbers means that 
	 * left > right */
//	public int find(int[] array, int t){
//		int smallestIndex = 0;
//		//find interruptio
//		for (int i=0; i<array.length-1; i++){
//			if(array[i]>array[i+1]){
//				smallestIndex = i+1;
//				break;
//			}
//		}
//		//Binary search
//		if (t>=array[0]) { // Should include 'equals'
//			return bSearch(array, 0, smallestIndex-1,t);
//		} else {
//			return bSearch(array, smallestIndex, array.length-1,t);
//		}
//	}
//	
//	private int bSearch(int[] array, int left, int right, int t){
//		if (left > right) return -1;
//		int mid = (right+left)/2;
//		if (array[mid] == t) return mid;
//		if (t > array[mid]) {
//			return bSearch(array, mid+1, right, t);
//		} else {
//			return bSearch(array, left, mid-1, t);
//		}
//	}
	
	public int find(int[] array, int t){
		int last = array.length - 1;
		return findHelper(array, t, 0, last);
	}
	
	private int findHelper(int[] array, int t, int begin, int last){
		int mid = (begin + last)/2;
		if (begin > last) return -1;
		if (array[mid] == t) return mid;
		if (array[begin] < array[mid]){ // beginning half is sorted
			if (t <= array[mid] && t >= array[begin]) {
				return findHelper(array, t, begin, mid-1);
			} else {
				return findHelper(array, t, mid+1, last);
			}
		} else if (array[begin] > array[mid]){
			if (array[mid] <= t && array[last] >= t) {
				return findHelper(array, t, mid+1, last);
			} else {
				return findHelper(array, t, begin, mid-1);
			}
		} else { // could be {2,2,2,2,2,3,4,2} or {2,3,4,2,2,2,2}
			if (array[mid] != array[last]) {
				return findHelper(array, t, mid+1, last);
			} else {
				int re = findHelper(array, t, mid+1, last);
				if (re == -1) {
					return findHelper(array,t,begin, mid-1);
				} else {
					return re;
				}
			}

		}
	}
}
