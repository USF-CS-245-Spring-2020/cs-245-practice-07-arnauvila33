/**
 * ArrayQueue
 * A class which implements Queue to work with Array implementation
 * @author arnauvila
 *
 */

public class ArrayQueue<T> implements Queue<T>{
		
	public int tail, head, capacity; //add to tail, remove from head
	public T queue[]; 

	public ArrayQueue(){
		head=0;
		tail=0;
		capacity=10;
		queue=(T[]) new Object[10];
	}
	
	/**
	 * doubleArray method.
	 * Doubles the length of the array
	 */
	public void doubleArray(){
		capacity=capacity*2;
		T[] newqueue=(T[])new Object[capacity];
		System.arraycopy(queue,0,newqueue,0,queue.length);
		queue=newqueue;
	}
	public T dequeue()throws Exception{
		T ret=queue[head];
		for(int i=0;i<tail;i++){
			queue[i]=queue[i+1];
		}
		tail--;
		return ret;
	}

	public void enqueue(T element){
		if(tail==capacity)
			doubleArray();
		queue[tail]=element;
		tail++;
	}

	public boolean empty(){
		return head==tail;
	}

	public void printQueue(){
		for(int i=0;i<tail;i++){
			System.out.print(queue[i]+" ");
		}
		System.out.println();

	}

	public static void main(String[] args)throws Exception{
		ArrayQueue queue=new ArrayQueue();
		System.out.println(queue.empty());
		queue.enqueue("f");
		queue.enqueue("g");
		queue.enqueue(1);
		queue.enqueue("4");
		System.out.println(queue.dequeue());
		queue.printQueue();
	}

}
