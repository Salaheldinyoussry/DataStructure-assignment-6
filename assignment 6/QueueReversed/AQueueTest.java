package eg.edu.alexu.csd.datastructure.queue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AQueueTest {

	@Test
	void test() {
        AQueue m =new AQueue(2);
        m.enqueue("2");
        assertEquals(m.size(),1);
        assertEquals(m.dequeue(),"2");
        m.enqueue('1');
        assertEquals(m.dequeue(),'1');
        assertEquals(m.isEmpty(),true);
        assertEquals(m.size(),0);
        AQueue mr =new AQueue(3);
        mr.enqueue("a");
        assertEquals(mr.dequeue(),"a");
        mr.enqueue("3");
        assertEquals(mr.size(),1);
        assertEquals(mr.dequeue(),"3");
        mr.enqueue('a');
        mr.enqueue('3');
        assertEquals(mr.size(),2);
        assertEquals(mr.isEmpty(),false);
        assertEquals(mr.dequeue(),'a');
        assertEquals(mr.dequeue(),'3');
		AQueue l = new AQueue(20);
		l.enqueue(1);	
		l.enqueue(2);	
		l.enqueue(3);	
		l.enqueue(4);	
		l.enqueue(5);	
		l.enqueue(6);	
		assertEquals(l.dequeue(),1);
		assertEquals(l.dequeue(),2);
		assertEquals(l.dequeue(),3);
		assertEquals(l.dequeue(),4);
		assertEquals(l.dequeue(),5);
		assertEquals(l.dequeue(),6);
		assertEquals(l.isEmpty(),true);
		assertEquals(l.size(),0);

		l.enqueue(7);	
		assertEquals(l.isEmpty(),false);
		assertEquals(l.size(),1);

		l.enqueue(8);	
		 l.enqueue(9);	
			assertEquals(l.size(),3);
	
			assertEquals(l.dequeue(),7);

	
	}








	@Test
	void test1() {
		AQueue l = new AQueue(5);	
		l.enqueue(8);	
		l.enqueue(8);	
		l.enqueue(8);	
		l.enqueue(8);	
		
		Exception e = assertThrows(IllegalStateException.class, () -> {		l.enqueue(8);});
		
		String st = "Queue is full";
	    String str = e.getMessage();
	    assertTrue(str.contains(st));
		
		
		
		
	}

	@Test
	void test2() {
		AQueue l = new AQueue(5);	
		
		Exception e = assertThrows(IllegalStateException.class, () -> {		l.dequeue();});
		
		String st = "Queue is empty";
	    String str = e.getMessage();
	    assertTrue(str.contains(st));
		
		
		
		
	}


}