package exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
int b=10;
@SuppressWarnings("unused")
String s=null;
try {
	@SuppressWarnings("unused")
	int c=a/b;
	
}catch(ArithmeticException e) {
	System.out.println("Internal error occured");
	e.printStackTrace();
	
}catch(Exception e) {
	System.out.println("1111----Internal error occured");

}finally {
	System.out.println("this is my final block");
}System.out.println("this is the end of statement");
	}

}
