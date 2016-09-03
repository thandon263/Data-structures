package adt;

public class Tree {
	
	Node root;
	
	public Tree(Object defaultValue) {
		root = new Node(defaultValue);
	}
	
    public void add(int value){
		add (this.root, value);
	}
	
	private void add(Node parent, int value){
		
		if (value < (int)parent.value){
			// Left
			if (parent.getLeft()!=null)
				add(parent.getLeft(), value);
			else
				parent.setLeft(value);
		} else {
			// Right
			if (parent.getRight()!=null)
				add(parent.getRight(), value);
			else
				parent.setRight(value);
		}
	}
	
	public void print(){
		print (root);
	}
	
	public void print(Node node){
		if (node != null){
			System.out.println(node.value);
			print(node.left);
			print(node.right);
		}
	}
	
	public static void main(String[] args) {
		
		Tree tree = new Tree(2);
		tree.add(0);
		tree.add(1);
		tree.add(3);
		tree.print();
		
	}

}
