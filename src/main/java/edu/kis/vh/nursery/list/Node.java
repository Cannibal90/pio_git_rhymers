package edu.kis.vh.nursery.list;

/**
 * Class which is a key part for IntLinkedList class
 */
public class Node {

	private int value;
	private Node prev;
	private Node next;

	/**
	 * public Node constructor
	 * @param i value assigned to created Node
	 */
	public Node(int i) {
		value = i;
	}
	/**
	 *@return value for Node
	 */
	public int getValue() {
		return value;
	}

	/**
	 *@return previous Node
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * Function to set a previous Node
	 * @param prev Node which will be set as previous Node
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * @return next Node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Function to set a next Node
	 * @param next Node which will be set as next Node
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
