package threadDemo;

import java.util.LinkedList;
import java.util.Iterator;

public class linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll=new LinkedList <String >();
ll.add("one");
ll.add("two");
ll.add("three");
ll.add("four");
ll.add("six");
ll.add("five");
ll.add("seven");
ll.add("eight");
ll.add("nine");
ll.add("ten");
System.out.println("\n Elements in linked list"+ll);
Iterator<String> it=ll.iterator();
System.out.println("\n  printing each elements from linked list");
while (it.hasNext()){
	System.out.println(it.next());
	
}
 it=ll.descendingIterator();
System.out.println("\n  printing each elements in reserved order from linked list");
while (it.hasNext()){
	System.out.println(it.next());

	}
System.out.println("\n elements in linkedlist:"+ll);
ll.removeFirst();
System.out.println("After removing first element:"+ll);

System.out.println("\n elements in linkedlist:"+ll);
ll.removeLast();
System.out.println("After removing Last element:"+ll);

System.out.println("\n elements in linkedlist:"+ll);
ll.removeFirstOccurrence("four");
System.out.println("After removing remove First Occurrence element:"+ll);

System.out.println("\n elements in linkedlist:"+ll);
ll.removeLastOccurrence("three");
System.out.println("After removing remove Last Occurrence element:"+ll);

ll.clear();
System.out.println("\n elements in linked list:"+ll);
}
}