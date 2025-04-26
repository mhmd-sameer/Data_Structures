import java.util.*;
class Node{
    int data;
    Node left,right;
    
    Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class BinaryTree
{
    public static Node create(int[] arr)
    {
        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int k=1;
        while(!q.isEmpty()&& k<arr.length)
        {
            Node a = q.poll();
            if(a.left==null)
            {
                a.left=new Node(arr[k]);
                q.add(a.left);
                k++;
            }
            if(a.right == null)
            {
                a.right=new Node(arr[k]);
                q.add(a.right);
                k++;
            }
        }
        return root;
        
    }
    public static void preOrder(Node root)
    {
        
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public static void InOrder(Node root)
    {
        
        if(root!=null)
        {
            InOrder(root.left);
            System.out.print(root.data+" ");
            InOrder(root.right);
        }
    }
    
    public static void postOrder(Node root)
    {
        
        if(root!=null)
        {
            postOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Nodes: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("enter the elements: ");
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		Node root = create(arr);
		
		System.out.println("Pre Order Traversal: ");
		preOrder(root);
		System.out.println();
		System.out.println("InOrder Traversal: ");
		InOrder(root);
		System.out.println();
		System.out.println("postOrder Traversal: ");
		postOrder(root);
	}
}
