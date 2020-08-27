import javax.swing.JOptionPane;

public class inventorysize
{
	public static void main (String args[])
	{     String squantity, socost, sscost, result="", sname="", name="";
        double quantity, ocost, scost, osinvent;
        
        sname=JOptionPane.showInputDialog ("Enter your name");
        name= "Your name is"+"\n" + sname ;
        JOptionPane.showMessageDialog(null, name);
        
        squantity=JOptionPane.showInputDialog ("Enter the quantity");
        quantity=Double.parseDouble(squantity);
        
        socost=JOptionPane.showInputDialog ("Enter the ordering cost");
        ocost=Double.parseDouble(socost);
        
        sscost=JOptionPane.showInputDialog ("Enter the storage cost");
        scost=Double.parseDouble(sscost);
              
        osinvent=Math.sqrt((2*quantity*ocost)/(scost));
        
        
        result= "The optimum inventory storage is " + osinvent;
        
            
  JOptionPane.showMessageDialog(null, result, "Optimum Inventory Storage Program", JOptionPane.INFORMATION_MESSAGE);
      }
}
            
     