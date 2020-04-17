package eg.edu.alexu.csd.datastructure.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LQueueTest {

	@Test
	void test() {
		try {
			LQueue test=new LQueue();
			assertEquals(0,test.size());
			test.enqueue("3");
			assertEquals(1,test.size());
			assertEquals(false,test.isEmpty());
			assertEquals("3",test.dequeue());
			assertEquals(0,test.size());
			assertEquals(true,test.isEmpty());
			test.enqueue('a');
			assertEquals('a',test.dequeue());
			assertEquals(true,test.isEmpty());
			test.enqueue(4);test.enqueue(5);test.enqueue(6);
			assertEquals(3,test.size());
			assertEquals(false,test.isEmpty());
			assertEquals(4,test.dequeue());
			assertEquals(2,test.size());
			assertEquals(false,test.isEmpty());
			assertEquals(5,test.dequeue());
			assertEquals(1,test.size());
			assertEquals(false,test.isEmpty());
			assertEquals(6,test.dequeue());
			assertEquals(0,test.size());
			assertEquals(true,test.isEmpty());
			assertEquals(null,test.dequeue());
			assertEquals(0,test.size());
			assertEquals(true,test.isEmpty());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Queue is empty");
		}
		
	}


}