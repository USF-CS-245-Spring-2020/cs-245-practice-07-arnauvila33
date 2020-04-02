/**
 * ArrayStack
 * A class which implements Stack to work with Array implementation
 * @author arnauvila
 *
 */


public class ArrayStack<T> implements Stack<T>{
	
	public int top,capacity;
	public T stack[];

	public ArrayStack(){
		top=-1;
		capacity=10;
		stack=(T[])new Object[10];
	}

	/**
	 * doubleArray method.
	 * Doubles length of the array
	 */
	public void doubleArray(){
		capacity=capacity*2;
		T[] newstack=(T[])new Object[capacity];
		System.arraycopy(stack,0,newstack,0,stack.length);
		stack=newstack;
	}
	public void push(T item){
		if(top>=capacity-1)
			doubleArray();
		stack[++top]=item;
	}

	public T pop() throws Exception{
		T x=stack[top--];
		return x;
	}

	public T peek() throws Exception{
		T x=stack[top];
		return x;

	}

	public boolean empty(){
		if(top<0)
			return true;
		else
			return false;
	}
	
	public void print(){
		for(int i=0;i<=top;i++){
			System.out.print(stack[i]+" ");

		}
		System.out.println();

	}
	public static void main(String[] args)throws Exception{
		ArrayStack stack=new ArrayStack();
		System.out.println(stack.empty());
		stack.push("A");
		stack.push("r");
		stack.push("n");
		System.out.println(stack.empty());
		stack.push("a");
		System.out.println(stack.pop());
		stack.print();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.empty());
		System.out.println(stack.peek());

	}


}
