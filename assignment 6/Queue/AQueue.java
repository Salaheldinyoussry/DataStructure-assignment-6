package eg.edu.alexu.csd.datastructure.queue;

public class AQueue implements IQueue,IArrayBased {
    public int size=0;
    private int f=0;
    private int r=0;
    private Object [] q;
    public AQueue(int size) {
    	if(size<2) {throw new IllegalStateException("Invalid size");}
    	this.size=size;
    	q=new Object[size];
    }
	@Override
	public void enqueue(Object item) {
		if(size()==this.size-1) {throw new IllegalStateException("Queue is full");}
		q[r]=item;
		r=(r+1)%this.size;
	}
	@Override
	public Object dequeue() {
		if(size()==0) {throw new IllegalStateException("Queue is empty");}
		Object t=q[f];
		q[f]=null;
		f=(f+1)%this.size;
		return t;
	}

	@Override
	public boolean isEmpty() {
		return (f==r);
	}
	@Override
	public int size() {
		return ((this.size-f+r)%this.size);
	}
}
