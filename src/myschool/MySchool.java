
package myschool;

public class MySchool {
    


        //attributes
                   protected String name;
                   protected String address;
                   protected String contact;
                   protected String email;
                   protected String website;


        //view_info method 
                 public void view_info()
                 {
                     Controller C = new Controller();
                     C.MySchoolControl(name, address, contact, email, website);
                 }
    
                        }

    

