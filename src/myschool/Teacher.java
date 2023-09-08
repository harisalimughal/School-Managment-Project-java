
package myschool;


public class Teacher extends  Person
    {
   
    //Attributes

            protected String Education;
            protected String course;
            protected int salary;
            protected String[] Students = new String[100];
            protected int n;
            
            Controller C = new Controller();
            //method Add_Details()
                    
                    public void Add_Details()
                    {

                      
                      C.AddDetailsTeacherControl();
                           
                    }
            //method Add_Students()
                    public void Add_Students()
                    {

                       C.AddStudentsTeacherControl();
                        
                    }

            //method Display_Students
                    public void Display_Students()
                    {
                       C.DisplayStudentsTeacherControl();
                    }  

            //method view_details
                    
                    public void view_details()
                    {

                           C.ViewDetailsTeacherControl();
                    }


            
    }
