
/**
 * Wrapper class that creates a new instance of the Tree class that directly handles the TreeNode objects. Method names are simplified and controlled by a user menu.
 * 
 * @author Sam Glendenning 
 */
public class Menu
{
    //New instance of the Tree class that has methods called from it 
    Tree tree = new Tree();
   
    /**
     * The main method, used to create an instance of the Menu class, that then calls the menu method.
     */
    public static void main(String[] args)
    {
        Menu Menu = new Menu();
        Menu.menu();
    }
    
    /**
     * The menu method. Directly controlled by the user and acts as a controlling class for the rest of the program. The user can select an option and the
     * appropriate method will be called, which then calls methods upon the instance of the Tree class.
     */
    public void menu()
    {
        int menuChoice;
        
        System.out.print('\f');
        
        do
        {
            System.out.println("");
            System.out.println("Please choose an option.");
            System.out.println("1. Add student to tree");
            System.out.println("2. Print in order");
            System.out.println("3. Print pre order");
            System.out.println("4. Print post order");
            System.out.println("5. Search for student");
            System.out.println("6. Remove student");
            System.out.println("7. Exit");
            
            menuChoice = Genio.getInteger();
            
            while (menuChoice <1 || menuChoice >7)
            {
                System.out.println("");
                System.out.println("Error. Please press a number between 1 and 7.");
                menuChoice = Genio.getInteger();
            }
            
            if (menuChoice == 1)
            {       
               add();
            }
                         
            if (menuChoice == 2)
            {
                printInOrder();
            }
            
            if (menuChoice == 3)
            {
                printPreOrder();
            }
            
            if (menuChoice == 4)
            {
                printPostOrder();
            }
            
            if (menuChoice == 5)
            {
                search();
            } 
            
            if (menuChoice == 6)
            {
                remove();
            }
        }
        while (menuChoice != 7);

        System.out.print('\f');
        menuExit();
    }
    
    /**
     * Asks the user for the ID and the mark of the student they wish to add. Inputs are validated for the ID to be >=1 and mark to be >=0 and <=100.
     * These values are then passed to a Tree method, which directly handles the addition of the student to the tree.
     */
    public void add()
    {
        System.out.print('\f');
        System.out.println("Enter the ID of the student you wish to add.");
        int id = Genio.getInteger();
        
        while (id < 1)
        {
            System.out.println("Please enter an ID number of at least 1");
            id = Genio.getInteger();
        }
        
        System.out.println("Enter the student's mark.");
        int mark = Genio.getInteger();
        
        while (mark < 0 || mark > 100)
        {
            System.out.println("Please enter a mark between 0 and 100");
            mark = Genio.getInteger();
        }
        
        tree.addToTree(id, mark);   //method present in the Tree class
    }
    
    /**
     * Used to print the nodes of the tree in numerical order. The tree cannot be printed if it is empty so this is checked for by checking if the root is null.
     * The print in order method is then called from the Tree class
     */
    public void printInOrder()
    {
        System.out.print('\f');
        
        if (tree.getRoot() == null)
        {
            System.out.println("The tree is empty.");
        }
        else
        {       
            System.out.println("The student IDs in numerical order are:");
            tree.printInOrder(tree.getRoot());
            System.out.println("");
        }
    }
    
    /**
     * Used to print the nodes of the tree in pre order form. The tree cannot be printed if it is empty so this is checked for by checking if the root is null.
     * The print in pre order method is then called from the Tree class
     */
    public void printPreOrder()
    {
        System.out.print('\f');
        
        if (tree.getRoot() == null)
        {
            System.out.println("The tree is empty.");
        }
        else
        {       
            System.out.println("The student IDs in pre order are:");
            tree.printPreOrder(tree.getRoot());
            System.out.println("");
        }
    }
    
    /**
     * Used to print the nodes of the tree in post order form. The tree cannot be printed if it is empty so this is checked for by checking if the root is null.
     * The print in post order method is then called from the Tree class
     */
    public void printPostOrder()
    {
        System.out.print('\f');
        
        if (tree.getRoot() == null)
        {
            System.out.println("The tree is empty.");
        }
        else
        {       
            System.out.println("The student IDs in post order are:");
            tree.printPostOrder(tree.getRoot());
            System.out.println("");
        }
    }
    
    /**
     * Used to search the tree for a student specified by their ID number. 
     */
    public void search()
    {
        System.out.print('\f');
        
        if (tree.getRoot() == null)
        {
            System.out.println("The tree is currently empty.");
        }
        else
        {
            System.out.println("Enter the ID of the student to search for.");
            int searchID = Genio.getInteger();
                    
            tree.findNode(tree.getRoot(), searchID);
                    
            if (tree.searchMark == -1)      //searchMark default value is -1, if unchanged i.e. no match was found, -1 is returned, so student not present
            {
                System.out.println("That student is not present in the tree.");
            }
            else    //if searchMark > -1, it has been changed to equal the found mark, so student present
            {
                System.out.println("Student with ID " + searchID + " achieved a mark of " + tree.searchMark);
            }
        }
    }
    
    /**
     * Used to remove a student i.e. their node, from the tree.
     */
    public void remove()
    {
        System.out.print('\f');
        
        if (tree.getRoot() == null)
        {
            System.out.println("The tree is currently empty.");
        }
        else
        { 
            System.out.println("Enter the ID of the student to remove.");
            int removeID = Genio.getInteger();
            
            tree.remove(tree.getRoot(), removeID);
        }
    }
    
    /**
     * Used to automatically end the program.
     */
    private static void menuExit()
    {
        System.out.print('\f');
        System.out.println("Program exiting...");
        
        try 
        {
            Thread.sleep(2000);
        } 
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        
        System.exit(0);
    }  
}
        
        
        
