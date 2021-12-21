package threads;


public class BinarySearchTree {
	private String word;
    private BinarySearchTree left;
    private BinarySearchTree right;
    
  
    public BinarySearchTree() {
        this.word = null;
        this.left = null;
        this.right = null;
    }
     
   
    public BinarySearchTree (String data) {
        this.word = data;
        this.left = null;
        this.right = null;
    }
	
    public void insertinto(String data) {
        if (this.word == null) 
        {
            this.word = data;
        }
        else
        {
            if (this.word.compareTo(data) > 0) 
            {
                if (this.left != null)
                {
                    this.left.insertinto(data);
                } 
                else
                {
                    this.left = new BinarySearchTree(data);
                }
 
            }
            else if(this.word.compareTo(data) < 0)
            {
                if (this.right != null)
                {
                    this.right.insertinto(data);
                }
                else
                {
                    this.right = new BinarySearchTree(data);
                }
 
            }
        }
    }	
	public void printtree() {
        if (this.left != null) {
            this.left.printtree();
        }
        System.out.println(this.word);
        if (this.right != null) {
            this.right.printtree();
        }
    }
	
	
}


