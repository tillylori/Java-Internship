import javax.swing.JOptionPane;
public class AddInts 
{ 
    
        
    
    public static void main (String [] args)
    {
		int sum = 0;
		int num = Integer.parseInt(JOptionPane.showInputDialog
							("Type in an integer, then <Enter>"));
		while (num != 0)
		{
		    sum = sum + num;
		    num = Integer.parseInt(JOptionPane.showInputDialog
					("Type in another integer (-99 to stop), then <Enter> "));
		}
		System.out.println ("The sum of the integers is " + sum);	
    }
}
