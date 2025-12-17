class ProfitLoss{
   public static void main(String []args){
      //cost price 
       double costPrice=129;
     //selling price
      double sellingPrice=191;
     //calculating profit by given cost and selling price
       double profit= sellingPrice-costPrice;
     //calculating profit percentage
     double profitPercentage= (profit/costPrice)*100;
     // Displaying profit and profitPercentage
     System.out.println("The Cost Price is INR"+ costPrice + "and Selling Price is INR" + sellingPrice+ "\nThe Profit is INR" + profit + "and the Profit Percentage is" + profitPercentage);
   }
}