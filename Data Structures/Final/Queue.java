public class Queue {
	private QNode [] queue;		// Array that stores the queue elements.
	private int front;			// Index pointing to the front of the queue.
	private int end;			// Index pointing to the element that is one less than the end of the queue.
	private int numElements;	// The number of elements currently stored in the queue.
	private int size;			// The capacity of the allocated array. If the number of elements reaches this capacity, we need to expand.

	public Queue() {
		numElements = 0;
		size = 1000; 
		front = size - 1;
		end = size - 1;
		queue = new QNode[size];
	}
	
	public void enqueue(QNode p) {
		if (numElements == size) copyArray(queue);
        queue[end] = p;
        end = (end - 1 + size) % size;	
        numElements++;
    }

	public QNode dequeue() {
		if (numElements == 0) return null;
	    QNode f = queue[front];
        front = (front - 1 + size) % size;
        numElements--;

    	return f;
	}

	public boolean isEmpty() {
		if (numElements == 0) return true;
		return false;
	}

	private void copyArray(QNode [] array) {
        int oldSize = size;
        size *= 2;
	    queue = new QNode[size];
        	
        int pos = size - 1;
        for (int i = front; i >= 0; i--, pos--) 
            queue[pos] = array[i];
        for (int i = oldSize - 1; i > front; i--, pos--) 
            queue[pos] = array[i];
        
        front = size - 1;
        end = size - 1 - numElements;
    }
}
