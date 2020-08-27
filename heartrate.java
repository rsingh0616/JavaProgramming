import javax.swing.JOptionPane;

public class heartrate
{
	public static void main (String args[])
	{     String sname, sage, srest, result="", name="";
        double age, rest, heartrate=0;
        
        sname=JOptionPane.showInputDialog ("Enter your name");
        name= "Your name is"+"\n" + sname ;
        JOptionPane.showMessageDialog(null, name);
        
        sage=JOptionPane.showInputDialog ("Enter your age");
        age=Double.parseDouble(sage);
        
        srest=JOptionPane.showInputDialog ("Enter your resting heart rate");
        rest=Double.parseDouble(srest);
        
        heartrate+= 0.7*(220-age) + 0.3*rest;
        
        result= "Your training heart rate is" + heartrate;
        
            
  JOptionPane.showMessageDialog(null, result, "heartrate program", JOptionPane.INFORMATION_MESSAGE);
      }
}
            
     