
package myschool;

import static java.lang.System.exit;
import java.util.Scanner;


public class Main {
   
            public static void main(String[]args)
                        { 
                            // object of class School
                                MySchool s =new MySchool();
                                s.view_info();
                                
                                
                            int x=1;

                            do{
                                // Exception Handling using try catch
                                    try{

                                        



                                         //object of Class Admin
                                          Admin A=new Admin();

                                         // creating object of Fee class
                                          Fee f=new Fee();
                                          Student S =new Student(37643,"CS", f);

                                             //int ch;
                                             Scanner sc=new Scanner(System.in);          
                                           int ch ;

                                            do {


                                                    System.out.println("Press 1 to Enter Fee Section");
                                                    System.out.println("Press 2 to Print Fee Transcript");
                                                    System.out.println("Press 3 to Enter Login Section");
                                                    System.out.println("Press 0 to exit Program");
                                                    System.out.println("------------------------------------------------------------------");

                                                    int choice=sc.nextInt();

                                                    switch(choice)
                                                     {
                                                        case 1 : f.AddFeeDetails();break;
                                                        case 2 : f.Transcript();break;
                                                        case 3: A.menu(); break;
                                                        case 0: exit(0);break;
                                                        default: System.out.println("Invalid Choice ");

                                                      }
                                                    
                                                    System.out.println("Press 1 to repeat the operation");
                                                    System.out.println("Press 2 to exit");
                                                    ch=sc.nextInt();

                                                    x=2;


                                                }while(ch==1);
                                  // catch block          
                                    } catch(Exception e)
                                    {
                                        System.out.println("This is not allowed! Please try again");
                                     }  // end of Exception Handling
                                    
                            }while(x==1);
                    }
            }

