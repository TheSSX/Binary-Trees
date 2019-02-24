/**
 * TreeNode class contains the specific fields for each node. The left and right fields are used to link the nodes together in the tree
 * 
 * @author Sam Glendenning
 */
public class TreeNode    
{
    private int id, mark;       //the student ID and their mark
    private TreeNode left;      //the node to the left of the current one
    private TreeNode right;     //the node to the right of the current one

    /**
     * New nodes have an ID and mark of 0, with no left and right nodes because they will be leaves
     */
    public TreeNode()
    {
        id = 0;
        mark = 0;
        left = null;
        right = null;
    }

    /**
     * This constructor is most often used, takes passed-in values for the ID and mark as these are necessary
     * 
     * @param id - the ID number of the student
     * @param mark - their mark
     */
    public TreeNode(int id, int mark)
    {
        this.id = id;
        this.mark = mark;
        left = null;
        right = null;
    }

    /**
     * Get the student ID contained in this tree node. Called a lot in the Tree class
     * 
     * @return id - the student's ID as an integer
     */
    public int getID()
    {
        return id;
    }

    /**
     * Get the student mark contained in this tree node
     * 
     * @return mark - the student's mark as an integer
     */
    public int getMark()
    {
        return mark;
    }

    /**
     * Get the node to the left of the one being evaluated
     * 
     * @return getLeft - a reference to the left node
     */
    public TreeNode getLeft()
    {
        return left;
    }
    
    /**
     * Get the node to the right of the one being evaluated
     * 
     * @return getRight - a reference to the right node
     */
    public TreeNode getRight()
    {
        return right;
    }

    /**
     * Reset the node to the left of the one being evaluated as the one passed in
     * 
     * @param left - the new left node
     */
    public void setLeft(TreeNode left)
    {
        this.left = left;
    }
    
    /**
     * Reset the node to the right of the one being evaluated as the one passed in
     * 
     * @param right - the new right node
     */
    public void setRight(TreeNode right)
    {
        this.right = right;
    }
    
    /**
     * Reset the ID number of this node 
     * 
     * @param id - the new ID
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * Reset the mark of this node
     * 
     * @param mark - the new mark
     */
    public void setMark(int mark)
    {
        this.mark = mark;
    }

    /**
     * Return a string containing summary data from this node
     * 
     * @return A String containing a summary of the data contained in this node
     */
    public String getSummaryData()
    {
        return "Student with ID " + id + " obtained the following mark: " + mark + "%";     
    }
}
