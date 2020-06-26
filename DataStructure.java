class Stack
{
	private int stackList[];
	private int total, top;

	Stack()
	{
		stackList = new int[3];
		total = 3;
		top = -1;
	}

	String push(int key)
	{
		if (top < total - 1)
		{
			top++;
			stackList[top] = key;
		}
		else
		{
			return "Overflow";
		}
		return "Successfully pushed";
	}

	void pop()
	{
		if (top > -1)
		{
			System.out.println("Popped out" + stackList[top]);
			top--;
		}
		else
		{
			System.out.println("Underflow");
		}
	}

	void display()
	{
		if (top >= 0)
		{
			for (int itr = top; itr >= 0; itr--)
			{
				System.out.println(stackList[itr]);
			}
		}
		else
		{
			System.out.println("Empty stack");
		}
	}

	int peek()
	{
		if(top>-1)
		{
			return stackList[top];
		}
		return -1;
	}
}

class Queue
{
	private int front, rear, total;
	private int queueList[];

	Queue()
	{
		queueList = new int[50];
		front = -1;
		rear = -1;
		total = 50;
	}

	void enQueue(int key)
	{
		if (rear == total - 1)
		{
			System.out.println("Overflow");
		}
		else
		{
			if (front == -1)
			{
				front = 0;
			}
			rear++;
			queueList[rear] = key;
			System.out.println("Element enqueued");
		}
	}

	void deQueue()
	{
		if (front == -1 || front > rear)
		{
			System.out.println("Underflow");
		}
		else
		{
			System.out.println("dequeued" + queueList[front]);
			front++;
		}
	}

	void display()
	{
		if (front == -1)
		{
			System.out.println("No elements in queue");
		}
		else
		{
			for (int i = front; i <= rear; i++)
			{
				System.out.println(queueList[i]);
			}
		}
	}
}

class CircularQueue
{
	private int front, rear, total;
	private int cirList[];

	CircularQueue()
	{
		cirList = new int[50];
		front = -1;
		rear = -1;
		total = 50;
	}

	void insertQueue(int key)
	{
		if((front==0 && rear==total-1) || front==rear+1)
		{
			System.out.println("overflow");
			return;
		}
		if(front==-1)
		{
			front=0;
			rear=0;
		}
		else
		{
			if(rear==total-1)
			{
				rear=0;
			}
			else
			{
				rear=rear+1;
			}
		}
		cirList[rear]=key;
	}

	void deleteQueue()
	{
		if(front==-1)
		{
			System.out.println("Underflow");
		}
		System.out.println("dequeue "+cirList[front]);
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			if(front==total-1)
			{
				front=0;
			}
			else
			{
				front=front+1;
			}
		}
	}
}

public class DataStructure
{

	public static void main(String s[])
	{
		Stack stack = new Stack();
		//perform operation of stack
		Queue queue = new Queue();
		//perform operation of Queue
		Queue cQueue = new Queue();
		//perform operation of Circular queue

	}
}