package edu.kis.vh.nursery.list;

/**
 * @param1 Value assigned to this Node
 * @param2 variable which indicate to previous Node
 * @param3 variable which indicate to next Node
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
	 * Function to get a value for Node
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Function to get a previous Node
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * Function to set a previous Node
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * Function to get a next Node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Function to set a next Node
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
