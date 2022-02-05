package exceptionhandling;
import java.io.IOException;
public class ExceptionPropagation {
void a() throws IOException{
	throw new IOException();
}
void b() throws InterruptedException,IOException{
a();
}
void c() {
	try {
		b();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		System.out.println("internal error handled by c");
	}
	}void test(){
		}
	public static void main(String[] args)throws InterruptedException{
		ExceptionPropagation obj=new ExceptionPropagation();
		obj.c();
		obj.test();
		
	}
}