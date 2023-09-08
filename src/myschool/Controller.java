
package myschool;

import static java.lang.System.exit;
import java.util.Scanner;


public class Controller extends MySchool {
    Scanner sc =new Scanner(System.in);
    
// Control of MySchool Class    
            public void MySchoolControl(String name, String address, String contact, String email,String website)
            {
                             name=" MUGHAL SCHOOL SYSTEM ISLAMABAD";
                             address="Peshawar Rd, near Hajj Complex،، I-14, Islamabad, Islamabad Capital Territory 46000";
                             contact= "(051)-111-747-424";
                             email="harisalimmughal077@gmail.com";
                             website="www.mughalschool.edu.pk";

                             System.out.println("------------------------------------------------"+name+"----------------------------------------------------------");
                             System.out.println("                                          ADDRESS:     "+address);
                             System.out.println("                                          CONTACT No.:  "+contact);
                             System.out.println("                                          EMAIL:        "+email);
                             System.out.println("                                          WEBSITE :     "+website);
                             System.out.println("---------------------------------------------------------------------------------------------");

            }
    
    // Control of Admin Class
            public void Admin_control(){
                int x=1;
                         do{
                            // Exception Handling - using Try Catch  
                            try{
                                    int ch; 
                                    do{ 
                                        // Creaying Scanner object        

                                            int choice;
                                            System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                                            System.out.println("-------------------Welcome to Login System------------------");
                                            System.out.println("Press 1 for Teacher Login");
                                            System.out.println("Press 2 for Student Login");
                                            System.out.println("Press 3 for Non_Teaching Staff Login");
                                            System.out.println("Press 0 to exit the Choice");
                                            System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

                                            choice=sc.nextInt();
                                        // Switch Case    
                                            switch (choice) 
                                             {

                                                case 1:
                                                    Person T=new Person();
                                                    T.TeacherLogin();
                                                    break;

                                                case 2:
                                                    Person s=new Person();
                                                    s.StudentLogin();
                                                    break;    
                                                case 3:
                                                    Person Nt=new Person();
                                                    Nt.Non_teachingStaffLogin();
                                                    break;
                                                case 0:
                                                    exit(0);

                                                default:
                                                    System.out.println("Wrong Choice, Plz try Again");
                                                    break;
                                             }


                                                System.out.println("Enter 1 to repeat the operation");	

                                                ch=sc.nextInt();

                                    }while(ch==1);// end of inner do while loop

                                        x=2;
                                  }
                                 // catch Block
                                 catch(Exception e)
                                     {
                                            System.out.println("This is not allowed! Please renter correct Values");
                                     }//end of Exception Handling Block

                         }while(x==1); //end of outer do while loop

            }
                    double total_fee; double paid_fee; double scholarship; double sclrshpFee; double remaining_fee;
                    
                    // constructor Fee    
               
     // Control of AddFee 
                    public void AddFee_control(){
                        
                         System.out.print("Enter your Total Fee: ");
                         total_fee=sc.nextDouble();

                         System.out.print("Enter the fee you Paid: ");
                         paid_fee=sc.nextDouble();

                         System.out.print("Enter ScholarShip percentange (if any): ");
                         scholarship=sc.nextDouble();
                         sclrshpFee=(scholarship/100)*total_fee;
 
                        if(sclrshpFee==0)
                          {
                            remaining_fee=(total_fee - paid_fee);
                            System.out.print("\t\tRemaing Fee: "+remaining_fee);
                          }
                        else if (sclrshpFee!=0)
                           {
                                  
                             remaining_fee =((total_fee-sclrshpFee) - paid_fee);  
                             System.out.println("Remaing Fee: "+remaining_fee);
                             System.out.println("==========================================================================");
                           }
                              //Fee F=new Fee( total_fee , paid_fee,scholarship, sclrshpFee,remaining_fee );  
                                       }
    // Control of Transcript 
         public void Transcript_control(){
         System.out.println("===========================================");
                        System.out.println("------Fee Transcript------------------------");
                        System.out.println("Total Fee: "+total_fee);
                        System.out.println("Your fee with Scolarship is :"+sclrshpFee);
                        
                        System.out.println("Fee Paid: "+paid_fee);
                        System.out.println("Remaining Fee: "+remaining_fee);
                        
                        System.out.println("========================================== ");

     }
                   protected  int  Sap; 
                   protected  String department;
                   protected  float cgpa;
                   protected  String[] course = new String[10];
                   Fee fee; 

              
                   
    // Control of  StudentAddDetail()             
                   
            public void StudentAddDetailControl(int  Sap, String department, float cgpa)
         {
             
                                   System.out.println("Enter your Name");
                                   name=sc.nextLine();

                                   System.out.println("Enter Your Department");
                                   department=sc.nextLine();

                                   System.out.println("Enter Your Sap");
                                   Sap=sc.nextInt();

                                   System.out.println("Enter Your CGPA");
                                   cgpa=sc.nextFloat();
             
         }
            int n;
    //Control of AddCourse()          
            public void AddCourseControl()
            {
             
                  System.out.print("Enter the number of Courses you want to add: ");  
                  n=sc.nextInt();  

                  System.out.println("Enter the courses of the Students: ");  
                  for(int i=0; i<=n; i++)  
                        {  

                               course[i]=sc.nextLine();  
                        }  
                
                
            }
            
            
    //Control of DisplayCourse()         
             public void DisplayCourseControl()
            {
            
                       System.out.println("Courses Added are: ");  
                        for (int i=0; i<=n; i++)
                        {   
                          System.out.print(i+" :");
                          System.out.println(course[i]);
                         }
            }
             
             
    //Control of ViewStudentDetails         
              public void ViewStudentDetailsControl(int  Sap, String department, float cgpa)
            {

                                    System.out.println("Name: "+name);
                                    System.out.println("Sap: "+Sap);
                                    System.out.println("Department: "+department);
                                    System.out.println("CGPA: "+cgpa);
            }
              
             
              
    // control of DisplayFee()          
               public void DisplayFeeControl(int  Sap, String department, float cgpa)
                {
                                    System.out.println("==========================================================================");
                                    
                                    System.out.println("----Previous Fee details:---");
                                    //System.out.println("\nSap:"+ Sap +", \nDepartment: "+ department );
                                    System.out.println("\nSap:"+ Sap +", \nDepartment: "+ department+ ", \nTotal Fee:"+fee.total_fee+ ", \nPaid Fee: "+ fee.paid_fee+ ", \nScholarship Perentage: "+ fee.scholarship+ ", \nScholarship Fee: "+ fee.sclrshpFee+ ", \nRemaining Fee: "+ fee.remaining_fee);
                                    
                                    System.out.println("==========================================================================");
                                    System.out.println("\n------Now Add your updated Fee Details:----");
                                    fee.AddFeeDetails();
                }
               
               String Role; int Salary; String Education;
           
               
               
    // Control of Add_detailNon_Teach           
               public void Add_detailsNon_Teach()
               {
                   Scanner sc=new Scanner(System.in);
                           System.out.println("Enter your Name");
                           name=sc.nextLine();

                           System.out.println("Enter Your Role");
                           Role=sc.nextLine();

                           System.out.println("Enter Your Education");
                           Education=sc.nextLine();

                           System.out.println("Enter Your Salary");
                           Salary=sc.nextInt();
                   
               }
               
            
               
    // Control of view_detailNonTeach()           
               public void view_detailsNonTeach()
               {
                   System.out.println("========================================================");

                            System.out.println("Name: "+name);
                            System.out.println("Role: "+Role);
                            System.out.println("Education :"+Education);
                            System.out.println("Salary :"+Salary);

                            System.out.println("========================================================");

               }
                 String Course; int salary; String[] Students = new String[100];
        
                 
    // Control of AddDetailsTeacherControl()             
               public void AddDetailsTeacherControl()
               {
                    Scanner sc=new Scanner(System.in);
                           System.out.println("Enter your Name");
                           name=sc.nextLine();

                           System.out.println("Enter Your Education");
                           Education=sc.nextLine();
                           
                           System.out.println("Enter the course you teach");
                           Course=sc.nextLine();
                           
                           System.out.println("Enter Your Salary");
                           salary=sc.nextInt();
               }
       
               
    // Control of AddStudentsTeacher()           
               
                public void AddStudentsTeacherControl()
               {
                    Scanner sc=new Scanner(System.in);  
                        System.out.print("Enter the number of Students you want to add: ");  
                        n=sc.nextInt();  


                        System.out.println("Enter the name of the Students: ");  
                        for(int i=0; i<=n; i++)  
                        {  

                            Students[i]=sc.nextLine();  
                        }  
               }
                
                
    // Control of ViewDetailsTeacher()            
                public void ViewDetailsTeacherControl()
                {
                
                            System.out.println("Name: "+name);
                            System.out.println("Eduction: "+Education);
                            System.out.println("Course: "+Course);
                            System.out.println("Salary: "+salary);
                }
       
                
    // Control of DisplayStudentsTeacher()            
                 public void DisplayStudentsTeacherControl()
                {
                    
                        System.out.println("Students Added are: ");  
                        for (int i=0; i<=n; i++)
                        {   
                          System.out.print(i+" :");
                          System.out.println(Students[i]);
                        }
                
                }
                 
              String Student_ID;
              String Student_Password;
              String Teacher_ID;
              String Teacher_Password;
              String Non_Teach_ID;
              String Non_Teach_Password;
         
              
              
    // Control of teacherLogin          
                 public void teacherloginControl()
                 {
                     
                            try{
                                    //Taking Input from User
                                                    System.out.println("----------Login---------");
                                                    System.out.println("Enter your ID");
                                                    Scanner s=new Scanner(System.in);
                                                    Teacher_ID=s.nextLine();        
                                                    System.out.println("Enter your Password");
                                                    Teacher_Password=s.nextLine();
                                    //creating an object of Teacher Class
                                                    Teacher t=new Teacher();
                                    //creating an object of Course_result              
                                                    Course_result cr=new Course_result();
                                                    if("teacher.edu.pk".equals(Teacher_ID)&&"12345".equals(Teacher_Password))
                                                            {       System.out.println("==========================================================");
                                                                    System.out.println("\n---------------Welcome to Teacher Portal-----------------"); 

                                                                    System.out.println("\nPress 1 to Add your details");
                                                                    System.out.println("Press 2 to Add Students in Class");
                                                                    System.out.println("Press 3 to Make Result ");
                                                                    System.out.println("Press 0 to exit");
                                                                    System.out.println("\n===========================================================");
                                                                    int ch;
                                                                    ch=s.nextInt();

                                                                switch(ch)
                                                                   {
                                                                    case 1: t.Add_Details();break;
                                                                    case 2: t.Add_Students();break;
                                                                    case 3:cr.make_result();break;
                                                                    case 0: exit(0);break;
                                                                    default:System.out.println("Invalid Choice");
                                                                   }

                                                                System.out.println("------------------------------------------------------------------------");
                                                                System.out.println("Press 1 to view details");
                                                                System.out.println("Press 2 to Display Students");
                                                                System.out.println("Press 3 to display result to Student");
                                                                System.out.println("Press 0 to exit");

                                                                ch=s.nextInt();
                                        // Switch Case to take Choice                        
                                                                switch(ch)
                                                                 {
                                                                    case 1: t.view_details();break;
                                                                    case 2: t.Display_Students();break;
                                                                    case 3: cr.display_result();break;
                                                                    case 0: exit(0);break;
                                                                    default:System.out.println("Invalid Choice");
                                                                 }
                                                        }
                                                        else
                                                         {

                                                            System.out.println("Wrong ID or Password !!!, Please Try again");
                                                         }

                                }catch(Exception e)

                                    {

                                        System.out.println(" This is not allowed ! Please try again"); 
                                    }

                 }
                 
       
                 
                 
    // control of studentloinControl()             
                 public void studentloginControl()
                 {
                     
                     
                     //Taking Input from User
                                    System.out.println("----------Login---------");
                                    System.out.println("Enter your ID");
                                    Scanner s=new Scanner(System.in);
                                    Student_ID=s.nextLine();        
                                    System.out.println("Enter your Password");
                                    Student_Password=s.nextLine();

                            //creating an object of Course_result              
                                    Course_result cr=new Course_result();
                                    Fee f=new Fee();
                            //creating Object of Student Class                     
                                    Student S=new Student(37643, "CS", f);
                                   // s.setPassword("12345");
                                    //s.setName("");
                                    Boolean a = S.StudentLogin(Student_ID,Student_Password);
                            if("student.edu.pk".equals(Student_ID)&&"12345".equals(Student_Password))
                                        {   System.out.println("==========================================================");
                                            System.out.println("Welcome to Student Portal"); 

                                            System.out.println("Press 1 to Add your details");
                                            System.out.println("Press 2 to Add Courses");

                                            System.out.println("Press 0 to exit");
                                            System.out.println("\n==========================================================");
                                            int ch;
                                            ch=s.nextInt();

                                            switch(ch)
                                                {
                                                case 1: S.Add_Details();break;
                                                case 2: S.Add_courses();break;
                                                case 0: exit(0);break;
                                                default:System.out.println("Invalid Choice");
                                                }

                                            System.out.println("------------------------------------------------------------------------");
                                            System.out.println("Press 1 to view details");
                                            System.out.println("Press 2 to Display Courses");  
                                            System.out.println("Press 0 to exit");

                                            ch=s.nextInt();
                                        // Switch Case to take Choice                        
                                            switch(ch)
                                                {
                                                case 1: S.view_details();break;
                                                case 2: S.Display_courses();break;
                                                case 0: exit(0);break;
                                                default:System.out.println("Invalid Choice");
                                                }
                                }
                            else
                                {

                                    System.out.println("Wrong ID or Password !!!, Please Try again");
                                }

                 }
                 
                 
                 
    // control of nonTeachLoginControl             
                 public void nonTeachingloginControl()
                 {
                      //Taking Input from User 
                                System.out.println("----------Login---------");
                                System.out.println("Enter your ID");
                                Scanner s=new Scanner(System.in);
                                Non_Teach_ID=s.nextLine();   
                                System.out.println("Enter your Password");
                                Non_Teach_Password=s.nextLine();

                            // creating an object of Non_TeachingStaff Class 
                                Non_TeachingStaff T=new Non_TeachingStaff();
                                
                                if("nonteach.edu.pk".equals(Non_Teach_ID)&&"12345".equals(Non_Teach_Password))
                                        {       System.out.println("==========================================================");
                                                System.out.println("Welcome to Non-Teaching Staff Portal"); 
                                                

                                                T.Add_Details();

                                                System.out.println("------------------------------------------------------------------------");
                                                System.out.println("Press 1 to view details");
                                                System.out.println("Press 0 to exit");
                                                System.out.println("\n==========================================================");
                                                int ch;
                                                ch=s.nextInt();
                                    // Switch Case to take Choice                        
                                            switch(ch)
                                                {
                                            case 1: T.view_details();break;
                                            case 0: exit(0);break;
                                            default:System.out.println("Invalid Choice");
                                                }
                                  }
                                else
                                  {
                                    System.out.println("Wrong ID or Password!!!, Please Try again");
                                  }

                 }
                 
       
                 
    // control of makeResultControl()          
                 private float[] total_marks = new float[10];
                 private float[] obtained_marks =new float[10];
                 private float[] percentage = new float[10];
                 private float gpa;
                 public void makeResultControl()
                 {
                     int ch;   
                            do{        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*\n");
                                       System.out.println(" Press 1 to enter Marks of OOP ");
                                       System.out.println(" Press 2 to enter Marks of DLD");
                                       System.out.println(" Press 3 to enter Marks of Calculus");
                                       System.out.println(" Press 4 to enter Marks of English");
                                       System.out.println(" Press 5 to enter Marks of Pak Studies");
                                       System.out.println(" Press 6 to enter GPA");
                                       System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");

                                       int choice;
                                       choice =sc.nextInt();


                                       switch(choice){

                                           case 1  : 
                                           {
                                               System.out.println("------Marks in OOP--------");


                                               System.out.println(" Enter the total marks of the subject"); 
                                               total_marks[1] = sc.nextFloat();

                                               System.out.println("Enter marks obtained in the subject");
                                               obtained_marks[1] =sc.nextFloat();

                                               percentage[1] = (obtained_marks[1]/total_marks[1])*100;
                                               System.out.println("Percentage of the marks is: "+percentage[1]);

                                           };break;



                                           case 2  : 
                                           {
                                               System.out.println("-----Marks in DLD-----");


                                               System.out.println(" Enter the total marks of the subject"); 
                                               total_marks[2] = sc.nextFloat();

                                               System.out.println("Enter marks obtained in the subject");
                                               obtained_marks[2] =sc.nextFloat();

                                               percentage[2] = (obtained_marks[2]/total_marks[2])*100;
                                               System.out.println("Percentage of the marks is: "+percentage[2]);

                                           };break;




                                           case 3  : 
                                           {
                                               System.out.println("-----Marks in Caculus------");


                                               System.out.println(" Enter the total marks of the subject"); 
                                               total_marks[3] = sc.nextFloat();

                                               System.out.println("Enter marks obtained in the subject");
                                               obtained_marks[3] =sc.nextFloat();

                                               percentage[3] = (obtained_marks[3]/total_marks[3])*100;
                                               System.out.println("Percentage of the marks is: "+percentage[3]);

                                           };break;





                                           case 4  : 
                                           {
                                               System.out.println("------Marks in English------");


                                               System.out.println(" Enter the total marks of the subject"); 
                                               total_marks[4] = sc.nextFloat();

                                               System.out.println("Enter marks obtained in the subject");
                                               obtained_marks[4] =sc.nextFloat();

                                               percentage[4] = (obtained_marks[4]/total_marks[4])*100;
                                               System.out.println("Percentage of the marks is: "+percentage[4]);

                                           };break;





                                           case 5  : 
                                           {
                                               System.out.println("------Marks in Pak Studies-----");


                                               System.out.println(" Enter the total marks of the subject"); 
                                               total_marks[5] = sc.nextFloat();

                                               System.out.println("Enter marks obtained in the subject");
                                               obtained_marks[5] =sc.nextFloat();

                                             percentage[5] = (obtained_marks[5]/total_marks[5])*100;
                                               System.out.println("Percentage of the marks is: "+percentage[5]);

                                          };break;

                                           case 6:{

                                               System.out.println("Enter GPA Obtained");
                                               gpa=sc.nextFloat();
                                                  };break;



                                           default: System.out.println(" Invalid Choice!!");break;
                                                    }
                                        System.out.println("Press 1 to repeat the process");
                                        System.out.println("Press 2 to exit the process");
                                        ch=sc.nextInt(); 
                             } while(ch==1);
 
                 }
        
                 
                 
    // control of displayResultControl()             
                 public void displayResultControl()
                 {
                      System.out.println("-------------------------------------------------------------------------");
                        System.out.println("You need to Login as a Student to enter Student Portal"); 
                        System.out.println("Enter your ID");
                        Scanner s=new Scanner(System.in);
                        Student_ID=s.nextLine();        
                        System.out.println("Enter your Password");
                        Student_Password=s.nextLine();
                        if("student.edu.pk".equals(Student_ID)&&"12345".equals(Student_Password))
                        {

                                    System.out.println("---------------Welcome to Student Portal----------------");
                                    
                                    System.out.println("=========================================================");
                                    System.out.println("\n\n----------Your Result------------------");
                                    System.out.println("\n");
                                    System.out.println("Marks in OOP: "        +obtained_marks[1]+ " /"+total_marks[1]);
                                    System.out.println("Marks in DLD: "        +obtained_marks[2]+ " /"+total_marks[2]);
                                    System.out.println("Marks in Calculus: "   +obtained_marks[3]+ " /"+total_marks[3]);
                                    System.out.println("Marks in Engilsh: "    +obtained_marks[4]+ " /"+total_marks[4]);
                                    System.out.println("Marks in Pak Studies: "+obtained_marks[5]+ " /"+total_marks[5]);

                                    System.out.println("Percentage of the marks in OOP: "+percentage[1]);
                                    System.out.println("Percentage of the marks in DlD: "+percentage[2]);
                                    System.out.println("Percentage of the marks in Calcululs: "+percentage[3]);
                                    System.out.println("Percentage of the marks in English: "+percentage[4]);
                                    System.out.println("Percentage of the marks in Pak Studies: "+percentage[5]);
                                    System.out.println("\n");
                                    System.out.println("YOUR GPA: "+gpa);
                                    System.out.println("\n===========================================================");
                                    
                        }
                 }
               
    }
