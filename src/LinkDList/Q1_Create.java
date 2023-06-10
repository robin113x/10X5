import java.util.*;

class Q1_Create{

	public static void printNodeRe(Node node){
		if(node==null)return;
		System.out.print(node.data+" ");
		printNodeRe(node.nxt);

	} 

	public static void printNodeIt(Node node)
	{
		if(node==null)return;
		Node temp = node;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.nxt;
		}
	}

	public static void main(String[] args) {
		Node head= new Node(10);
		Node n1 = new Node(20);
		Node n2 = new Node(30);
		Node n3 = new Node(40);

		head.nxt=n1;
		n1.nxt=n2;
		n2.nxt=n3;
		n3.nxt=null;

		printNodeRe(head);
		System.out.println("\n**************");
		printNodeIt(head);


	}
}