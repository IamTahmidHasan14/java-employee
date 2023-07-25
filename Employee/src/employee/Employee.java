package employee;
  
    public class Employee extends Object {
       private String firstName;
       private String lastName;
       private Date birthDate;
       private Date hireDate;
  
      // constructor to initialize name, birth date and hire date
      public Employee( String first, String last, 
        int birthMonth, int birthDay, int birthYear, 
        int hireMonth, int hireDay, int hireYear )
      {
         firstName = first;
         lastName = last;
         birthDate = new Date( birthMonth, birthDay, birthYear );
         hireDate = new Date( hireMonth, hireDay, hireYear );
      }

    Employee(String bob, String jones, int i, int i0, int i1, int i2, int i3, int i4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

      public String toString()
      {
         return lastName + ", " + firstName +
            "  Hired: " + hireDate.toString() +
            "  Birthday: " + birthDate.toString();
      }   
   }  
