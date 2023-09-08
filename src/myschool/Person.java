
package myschool;


// class Person
public class Person extends Admin 
    {

                //Attributes
                    protected String name;
                    protected String contact;


               
                       

             Controller C = new Controller();
            //method TeacherLogin()
                    public void TeacherLogin()
                        {
                            C.teacherloginControl();
                        }            



            //Method StudentLogin()
                    public void StudentLogin()
                        {
                            C.studentloginControl();
                        }

            //method Non_teachingStaffLogin()
                    public void Non_teachingStaffLogin()
                        {
                            C.nonTeachingloginControl();

                        }


} 

