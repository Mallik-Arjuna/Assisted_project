package collection.framework;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {
Stack<String>stack=new Stack<>();
stack.push("ruchi");
stack.push("komal");
stack.push("nikhil");
stack.push("kaushal");
stack.push("avnish");

String s1=stack.pop();
String s2=stack.pop();

System.out.println(s1);
System.out.println(s2);

}
}

