import java.util.*;

class Q2_InsertNode{

	//Insert at Beginning
	public static Node insertFirst(Node node,int data){
		Node temp = new Node(data);
		if(node==null)return temp;
		temp.nxt=node;
		return temp;
	}

	//Insert at Last
	public static Node insertLast(Node node,int data){
		Node temp=new Node(data);
		if(node==null)return temp;
		Node curr = node;
		Node head=curr;
		while(curr.nxt!=null){
			curr=curr.nxt;
		}
		curr.nxt=temp;
		return head;
	}

	//Array to LL
	public static Node arrayToLL(int[]arr){
		if(arr.length==0)return null;
		Node head= new Node(arr[0]);
		Node currNode =head;
		for(int i=1;i<arr.length;i++){
			Node node = new Node(arr[i]);
			currNode.nxt=node;
			currNode=node;
		}
		return head;
	}

	//Printing Node
	public static void printNodeRe(Node node){
		if(node==null)return;
		System.out.print(node.data+" ");
		printNodeRe(node.nxt);

	} 


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}

		Node node = arrayToLL(arr);
		Node temp = insertFirst(node,11);
		printNodeRe(temp);

		System.out.println("\n*****");
		temp = insertLast(temp,999);
		printNodeRe(temp);


	}
}