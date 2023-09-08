
package myschool;

public class Fee
    {
        //attributes  
         protected double total_fee;
         protected double paid_fee;
         protected double scholarship;
         protected double sclrshpFee;
         protected double remaining_fee;

      

         // creating object of Controller Class      
                Controller C=new Controller();
          //method fee_detail
                  public void AddFeeDetails()
                  {
                    
                    C.AddFee_control();
                          

                  }
          //method Transcript
                  public void Transcript()
                  {
                      
                      C.Transcript_control();
                  }

    }
