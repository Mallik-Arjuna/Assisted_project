package collection.framework;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class priorityQueue
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
PriorityQueue<String>queue=new PriorityQueue<>();
LinkedList<String>list=new LinkedList<>();
queue.add("Ruchi");
queue.add("Suchi");
queue.add("Rucha");
queue.add("Sucha");

System.out.println("==============");

for (String value:queue) {
	System.out.println(value); 
}
	System.out.println("==============");
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	
	System.out.println(queue.peek());

	System.out.println("==============");
	for(String value : queue) {
		System.out.println(value);
	}
	}
}
