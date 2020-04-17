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
    	f=size-1;r=size-1;
    }
	@Override
	public void enqueue(Object item) {
		if(size()==this.size-1) {throw new IllegalStateException("Queue is full");}
		q[((f-1)%this.size+this.size)%this.size]=item;
		f=((f-1)%this.size+this.size)%this.size;
	}
	@Override
	public Object dequeue() {
		if(size()==0) {throw new IllegalStateException("Queue is empty");}
		Object t=q[((r-1)%this.size+this.size)%this.size];
		q[((r-1)%this.size+this.size)%this.size]=null;
		r=((r-1)%this.size+this.size)%this.size;
		return t;
	}

	@Override
	public boolean isEmpty() {
		return (f==r);
	}
	@Override
	public int size() {
		return ((this.size-f+r)%this.size);
	}}

