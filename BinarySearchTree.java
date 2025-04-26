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
public class BinarySearchTree{
    static Node root;
    public static void create(int i)
    {
       Node newNode = new Node(i);
       if(root==null)
       {
           root=newNode;
       }
       else{
           Node current = root;
           while(true)
           {
               if(i<=current.data)
               {
                   if(current.left==null)
                   {
                       current.left=newNode;
                       current=current.left;
                       break;
                   }
                   else{
                       current=current.left;
                   }
               }
               else{
                   if(current.right==null)
                   {
                       current.right=newNode;
                       current=current.right;
                       break;
                   }
                   else{
                       current=current.right;
                   }
               }
           }
       }
    }
    public static void Inorder(Node root)
    {
        if(root!=null)
        {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
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
    public static void postOrder(Node root)
    {
        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
            
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i:arr)
        {
            create(i);
        }
        System.out.println("PreOrder traversal:");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder traversal:");
        Inorder(root);
        System.out.println();
        System.out.println("PostOrder traversal:");
        postOrder(root);
    }
}