
package myschool;



public class Course_result extends Teacher
    {
    
        //attributes
        private float[] total_marks = new float[10];
        private float[] obtained_marks =new float[10];
        private float[] percentage = new float[10];
        private float gpa;

         Controller C = new Controller();
        //method make_result 
                public void make_result()
                {
                    C.makeResultControl();
         }
        // method display_result 
                public void display_result()
                {
                    C.displayResultControl();
                }       

    }
