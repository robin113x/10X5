import java.util.*;

class Q3_DeleteNode{

	//Delete First
	public static Node deleteFirst(Node node){
		if(node==null || node.nxt==null)return null;
		return node.nxt;
	}

	//Delete Last
	public static Node deleteLast(Node node){
		if(node==null || node.nxt==null)return null;

		Node curr = node;
		while(curr.nxt.nxt!=null)
			curr=curr.nxt;
		curr.nxt=null;
		return node;
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
		printNodeRe(node);
		System.out.println("\n");
		Node res= deleteFirst(node);
		printNodeRe(res);
		System.out.println("\n");
		res = deleteLast(res);
		printNodeRe(res);

	}
}