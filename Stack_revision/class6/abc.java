
class TLNode
{
 int data;
 TLNode left,right;
 
 TLNode(int d)
 {
   data=d;
  }
 }
 
 
 class BinaryTree
{
   public void preorder(TLNode r)
   {
		if(r==null)
		    return;
		
		System.out.print(r.data+" ");
		
		preorder(r.left);
		preorder(r.right);
		
   }
 public void inorder(TLNode r)
   {
		if(r==null)
		    return;
		
		
		inorder(r.left);
		System.out.print(r.data+" ");
		inorder(r.right);
		
   }
  public void postorder(TLNode r)
   {
		if(r==null)
		    return;
		
		
		postorder(r.left);
		postorder(r.right);
		System.out.print(r.data+" ");

   }
}
public class TEST1 {

	public static void main(String[] args) {
TLNode root=new TLNode(1);
		
		root.left=new TLNode(2);
		root.right=new TLNode(3);
		
		root.left.left=new TLNode(4);
		root.left.right=new TLNode(5);
		
		root.right.left=new TLNode(6);
		root.right.right=new TLNode(7);
		BinaryTree o=new BinaryTree();
		o.preorder(root);
	//	preorder(root);
		System.out.println();
		
		o.inorder(root);
		System.out.println();
		
		o.postorder(root);
		System.out.println();

	}

}