
public class Main {
	public static void main(String args[])
	{
		Stack myStack = new Stack(4);
		myStack.push("one");
		System.out.println(myStack.peek());
		myStack.push("two");
		System.out.println(myStack.peek());
		myStack.push("three");
		System.out.println(myStack.peek());
		myStack.push("four");
		System.out.println(myStack.peek());
		myStack.push("five");
		System.out.println(myStack.peek());
		System.out.println(myStack.empty());
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		System.out.println(myStack.empty());
		
	}
	
}
