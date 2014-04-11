package CC150;

public class p11_1 {
	public void mergeArray(int[] a, int[] b, int lastA){
		// Move a[] to empty b.length space in the beginning
		for(int i=lastA-1+b.length; i>=b.length; i--){
			a[i] = a[i-b.length];
		}
		
		int pa = b.length;
		int pb = 0;
		int cur = 0;
		while (pb < b.length && pa < lastA-1+b.length){
			if(b[pb] < a[pa]){
				a[cur]=b[pb]; 
				pb++;
			} else {
				a[cur] = a[pa];
				pa++;
			}
			cur++;
		}
		// if pa reaches the end first, exhaust pb.
		// no need to think if pb exhaust first, cuz then a[] is in right place
		for (int i=pb; i<b.length; i++){
			a[cur] = b[pb];
			cur++;
			pb++;
		}
	}
}
