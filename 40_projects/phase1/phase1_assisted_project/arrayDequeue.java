package collection.framework;
import java.util.ArrayDeque;
import java.util.Iterator;

public class arrayDequeue extends Object {

	public static void main(String[] args) {
		
		ArrayDeque<String> dqueue = new ArrayDeque<>();
		dqueue.add("Ruchi");
		dqueue.add("yogesh");
		dqueue.add("guddie");
		dqueue.add("nanu");
		dqueue.offer("komal");
		dqueue.offerFirst("nikhil");
		dqueue.offerLast("Avnish");
		dqueue.addFirst("kaushal");
		
		
		// Add and offer difference: 
		// Add: If array is full, it will throw exception
		// Offer: if arary is full, it will just return false

		// 	Mrugesh,Gautamm, Alex,
		
		
		for(String value : dqueue) {
			System.out.println(value);
		}
		
		System.out.println("-------------");
		
		System.out.println(dqueue.pollLast());
		//System.out.println();
		
		
		
		

	}

}

