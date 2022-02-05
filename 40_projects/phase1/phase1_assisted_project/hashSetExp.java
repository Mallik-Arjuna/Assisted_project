package collection.framework;

import java.util.HashSet;

public class hashSetExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		set.add("Ruchi");
		set.add("Suchi");
		set.add("Rucha");
		set.add("Sucha");
		
		
		for(String elem : set) {
			System.out.println(elem);
		}
	}

}
