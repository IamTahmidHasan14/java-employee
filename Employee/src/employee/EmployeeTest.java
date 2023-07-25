package employee;

import javax.swing.JOptionPane;
    
public class EmployeeTest {
   
      public static void main( String args[] )
      {
         Employee employee = new Employee( "Bob", "Jones", 
            7, 24, 49, 3, 12, 88 );
   
         JOptionPane.showMessageDialog( null,
            employee.toString(), "Testing Class Employee",
            JOptionPane.INFORMATION_MESSAGE );
   
         System.exit( 0 );
      }
   
   }
