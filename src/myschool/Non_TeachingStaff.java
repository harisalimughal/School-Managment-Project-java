
package myschool;


public class Non_TeachingStaff extends Person 
{
     //Attributes

           private String Role;
           private int Salary;
           private String Education;

          Controller C = new Controller();
            //method Add_Details()
           
                        public void Add_Details()
                        {
                           C.Add_detailsNon_Teach();
                        }


            //method view_details
                        public void view_details()
                        {
                            C.view_detailsNonTeach();
                        }

}
