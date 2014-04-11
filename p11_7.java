package CC150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Person{
	int height;
	int weight;
	
	public Person(int h, int w){
		height = h;
		weight = w;
	}
	
	public String toString(){
		return "("+height+","+ weight+")";
	}
}

class WeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		if(p1.weight > p2.weight){
			return 1;
		} else if (p1.weight < p2.weight){
			return -1;
		} else {
			return 0;
		}
	}

}

public class p11_7 {
	
	public ArrayList<Person> largestTower(Person[] pool){
		Arrays.sort(pool, new WeightComparator());
		ArrayList<Person> largest = new ArrayList<Person>();
		for (int i=pool.length-1; i>=0; i--){
			if (i < largest.size() - 1) break;
			ArrayList<Person> tmp = new ArrayList<Person>();
			tmp.add(pool[i]);
			int pointer = i-1;
			while(0 <= pointer){
				if (pool[pointer].height< tmp.get(tmp.size()-1).height){
					tmp.add(pool[pointer]);
				}
				pointer--;
			}
			if (tmp.size() > largest.size()) largest = tmp;
		}
		
		return largest;
	}
	

}
