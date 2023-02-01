# Implement Queue Using Stacks

Implement a first in first out (FIFO) queue usig only two stacks.The implemented should support all the functions of a normal queue (push, peek, pop, and empty).

Implement the MyQueue class:

- void push(int x) Pushes element x to the back of the queue

- int pop() Removes the element from the front of the queue and return it.

- int peek() Returns the element at the front of the queue.

- boolean empty() Returns true if the queue is empty, false otherwise.

Example:

Input:

["MyQueue", "push", "push", "peek", "pop", "empty"]

[[], [1], [2], [], [], []]

Output:

[null, null, null, 1, 1, false]


Explanation:

MyQueue myQueue = new MyQueue();

myQueue.push(1); // queue is: [1]

myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)

myQueue.peek(); // return 1

myQueue.pop(); // return 1, queue is [2]

myQueue.empty(); // return false


A basis queue has the following operations

- Enqueue: add a new element to the end of the queue.

- Dequeue: remove the element from the front of the queue and return it.


	class MyQueue{
		Stack<Integer> s1 = new Stack();
		Stack<Integer> s2 = new Stack();
		
		public MyQueue(){
			
		}

		public void push(int x){
			while (!s1.isEmpty(){
				s2.push(s1.pop());
			}
			s1.push(x);
			while (!s2.isEmpty()){
				s1.push(s2.pop());
			}
		}

		public int pop(){
			return s1.pop();

		}
		public int peek(){
			return s1.peek();

		}

		public boolean empty(){
			return s1.isEmpty() && s2.isEmpty();
		}
	} 


	MyQueue obj = new MyQueue();

	obj.push(x);
	int param_2 = obj.pop();
	int param_3 = obj.peek();
	boolean param_4 = obj.empty();


