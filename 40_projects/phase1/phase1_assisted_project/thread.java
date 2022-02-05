package threadDemo;

class ThreadClass implements Runnable{
thread thread;
String threadName;
ThreadClass(String name)
{
	this.threadName=name;
	System.out.println("creating thread"+this.threadName);
	
}public void run()
{
	System.out.println("Running thread"+this.threadName);
	try {
		for (int i=5;i>0;i--) {
			System.out.println("Thread Name"+this.threadName +""+i);
			Thread.sleep(50);
		}
	}
	catch(InterruptedException e)
	{
		System.out.println("Thread with name "+this.threadName+"is stoprd in betwwen");
		
	}
	System.out.println("thread with thread name"+this.threadName+"exited");
	
} public void start()
{
System.out.println("stsrting thread with thread name"+this.threadName);
if(thread==null) {
	thread=new thread();
	thread.start();
	}
}

}
public class thread{
	public static void main(String args[]) {
		ThreadClass t1=new ThreadClass("thread1");
		t1.start();
		ThreadClass t2=new ThreadClass("thread2");
		t2.start();
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
