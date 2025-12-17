class StudentFeesDiscount{
     public static void main(String []args){
       // fee of the student for the course
        int fee=125000;
       // the total  discount percent
        int discountPercent= 10;
       // the total amount of the discount
        double discount=(double)((fee*discountPercent)/100);
       //the amount of fee need to pay 
         double finalfee=(fee-discount);
        System.out.println("The discount amount is INR" + discount + "and the final discount from the fee" + finalfee ); 
   }
}