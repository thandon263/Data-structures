package adt;

public class Node {
	
	Node left;
	Node right;
	Object value;
	
	public Node(Object value) {
		setValue(value);
	}
	
	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
	
	public void setRight(Object value){
		this.right = new Node(value);
	}
	
	public void setLeft(Object value){
		this.left = new Node(value);
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
