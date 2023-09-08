
package myschool;




public class Student extends Person 
   {
    
            //Attributes 
                   private int Sap; 
                   protected String department;
                   protected float cgpa;
                   protected String[] course = new String[10];
                   int n;
                   protected String password ;
             // Aggregation between Student and fee
                     Fee fee; 
                     
            
                        Controller C = new Controller();
            //method Add_details() 
            public Boolean StudentLogin(String name, String password)
            {
                if(this.password.equals(password) || super.name.equals(name))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }             
                         public void  Add_Details()
                            {
                                
                                C.StudentAddDetailControl(Sap, department, cgpa);

                            }

             //method Add_courses            
                         public void  Add_courses()
                            {

                               C.AddCourseControl();
                            }

             //method Display_courses()
                          public void  Display_courses()
                            {
                              C.DisplayCourseControl();

                            }

             //method View_Details() 
                            
                            public void  view_details()
                                {
                                   C.ViewStudentDetailsControl(Sap, department, cgpa);

                                }
             // constructor
                     public Student(int s, String depart,Fee f) 
                                {
                                    this.Sap = s;
                                    this.department = depart;
                                    this.fee=f;
                                }
                            
            // method display_fee
                         public void display_fee()
                                {
                                    
                                    C.DisplayFeeControl(Sap, department, cgpa);
                                    
                                }


    
}

