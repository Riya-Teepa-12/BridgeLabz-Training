import java.util.*;
class FeesOfStudent{
   public static void main(String []args){
        Scanner kb=new Scanner(System.in);
       // creating variable fee and discountPercent and taking input from user
       double fee;
       fee=kb.nextDouble();
       double  discountPercentage;
       discountPercentage= kb.nextDouble();
       //finding the discount and the fees to pay

       double discount = (fee*discountPercentage)/100;
       double feeToPay = fee-discount;

       // displaying the discount amount and the discounted fee to pay
       System.out.println("The discount amount in INR" + discount + "and final discounted fee is INR" + feeToPay);
     
   }
}