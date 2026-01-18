package Tree_Examples;

public class Tree_Class {

	 Node root;

	    void insert(Node r,Node n)//r is root/parent  n is new node
	    {
	        if(root==null)//first node
	            root=n;
	        else
	        {
	            if(n.data<r.data)//left
	            {
	                if(r.left==null)
	                    r.left=n;
	                else
	                    insert(r.left,n);//go to left and explore
	            }
	            else
	            {
	                if(r.right==null)
	                    r.right=n;
	                else
	                    insert(r.right,n);//go to right and explore
	            }

	        }
	    }
	    
	    int count_node(Node r)
	    {
	        if(r==null)
	            return 0;
	        else
	            return 1+count_node(r.left)+count_node(r.right);
	    }
	    
	    int count_leaf_node(Node r)
	    {
	        if(r==null)
	            return 0;
	        else if(r.left == null && r.right == null){ 
	        		return 1;
	        }
	        
	        return count_leaf_node(r.left) + count_leaf_node(r.right);
	    }
	    
	    int tree_value(Node r)
	    {
	        if(r==null)
	            return 0;
	        else
	            return r.data + tree_value(r.left) + tree_value(r.right);
	    }
	    
	    //return depth of a tree:length of longest running branch(Max of length)
	    int count_depth(Node r)
	    {
	        if(r==null)
	            return 0;
	        else
	        {
	            int length_left=count_depth(r.left);
	            int length_right=count_depth(r.right);
	            return 1+Math.max(length_left,length_right);
	        }
	    }


	    void inorder(Node r)
	    {
	        if(r!=null)//LPR
	        {
	            inorder(r.left);//L
	            System.out.print(r.data+",");//P
	            inorder(r.right);//R
	        }
	    }

	    void preorder(Node r)
	    {
	        if(r!=null)//PLR
	        {
	        	System.out.print(r.data+",");//P
	            inorder(r.left);//L
	            inorder(r.right);//R
	        }
	    }
	    
	    void postorder(Node r)
	    {
	        if(r!=null)//LRP
	        {
	            inorder(r.left);//L
	            inorder(r.right);//R
	            System.out.print(r.data+",");//P
	        }
	    }
	    
	    public static void main(String[] args) {
	        Tree_Class t=new Tree_Class();
	        t.insert(t.root,new Node(10));
	        t.insert(t.root,new Node(20));
	        t.insert(t.root,new Node(5));
	        t.insert(t.root,new Node(15));
	        t.insert(t.root,new Node(30));
	        System.out.print("\nInorder:");
	        t.inorder(t.root);//5,10,15,20,30
	        
	        
	        int choice=0;
	        
	        
	        do {
	        	System.out.println("Tree Menu : ");
		        System.out.println("============");
		        System.out.println("1.Insert");
		        System.out.println("2.Inorder");
		        System.out.println("3.Preorder");
		        System.out.println("4.Postorder");
		        
	        	switch(choice) {
	        		case 1:  
	        		
	        	}
	        } while(choice != 0);
	    }

	
}
