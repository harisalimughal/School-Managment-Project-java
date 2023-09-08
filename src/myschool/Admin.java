
package myschool;

//class 
public class Admin extends MySchool 
    {
        //attributes 
             protected String Student_ID;
             protected String Student_Password;
             protected String Teacher_ID;
             protected String Teacher_Password;
             protected String Non_Teach_ID;
             protected String Non_Teach_Password;
  
        //method menu()

             public void menu()
                 {
                 Controller C = new Controller();
                 C.Admin_control();
                 } 
    }







