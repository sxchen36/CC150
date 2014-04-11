package CC150;

public class p11_5 {
	public int find(String[] list, String t, int left, int end){
		int mid = (left + end)/2;
		
		if (list[mid].isEmpty()){
			int l = mid-1;
			int r = mid+1;
			while (true){
				if(l<left || r>end) return -1;
				if(l >= left && !list[l].isEmpty()){
					mid = l;
					break;
				}
				if (r <= end && !list[r].isEmpty()){
					mid = r;
					break;
				}
				l--;
				r++;
			}
		}
		if (t.equals(list[mid])) {
			return mid;
		} else if (t.compareTo(list[mid]) < 0) {
			return find(list, t, left, mid-1);
		} else {
			return find(list,t,mid+1,end);
		}

	}
}
