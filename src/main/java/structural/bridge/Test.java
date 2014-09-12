package structural.bridge;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		HashMap<String, String> t = new HashMap<String,String>();
		Node<Object> ni = new Node<Object>(10, null);
		ni = new Node<Object>(20, ni);
		ni = new Node<Object>(30, ni);
		ni = new Node<Object>(40, ni);
		ni = new Node<Object>("String", ni);
		while(ni != null)
		{
			System.out.print(ni.getData() + "==>");
			ni = ni.getNext();
		}
		System.out.print("End");
		
	}
}

class Node<T> {
	private T data;
	private Node<T> next;

	public Node(T data, Node<T> ni) {
		this.data = data;
		this.next = ni;
	}

	public T getData() {
		return this.data;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
}