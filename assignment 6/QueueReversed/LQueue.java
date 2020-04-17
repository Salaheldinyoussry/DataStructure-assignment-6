package eg.edu.alexu.csd.datastructure.queue;


public class LQueue implements IQueue , ILinkedBased {

	public class Node{
		Object value;
		Node next;
	    Node prev;
	  public Node(Object o) {
		  this.value=o;
	  }
	  public Node() {
	  }
	}
	
	private Node head =new Node();
	private Node tail =new Node();
    public LQueue(){
    	head.next=tail;
    	tail.prev=head; }
	
	private int size=0;
	@Override
	public int size() {
		
		return this.size;
	}
	
	@Override
	public boolean isEmpty() {
		if(size==0) return true;
		else return false;
	}
	
	@Override
	public void enqueue(Object item) {
		
		Node newNode =new Node(item);
		if(head.next==tail) {
			head.next=newNode;
		    tail.prev=newNode;
		    newNode.next=tail;
		    newNode.prev=head;
		}
		else {
			newNode.next=head.next;
			head.next.prev=newNode;
			head.next=newNode;
			newNode.prev=head;
            
		}
	size++;
	}
	
	@Override
	public Object dequeue() {
	if(isEmpty()) {
		 throw new IllegalStateException("the Queue is Empty");	}
		Object o =tail.prev.value;
	tail.prev=tail.prev.prev;
	tail.prev.next=tail;
	size--;
	return o;
	
	}
	
	}