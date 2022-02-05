package collection.framework;
import java.util.ArrayList;
import java.util.Iterator;
public class arrayList{
public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Ruchi");
		list.add("Supriya");
		list.add("Komal");
		list.add("nikhil");
		list.add("Ravi");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
		String value = itr.next();
			System.out.println(value);
		}
		
		for(String value : list) {
			
			//
			System.out.println(value);
		}
		
		//list.remove("Ajay");
	}

}
