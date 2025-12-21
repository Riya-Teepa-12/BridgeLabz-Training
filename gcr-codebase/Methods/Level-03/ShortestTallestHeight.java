
import java.util.*;
class ShortestTallestHeight{

   //sum of heights
   public static int findSum(int[] heights){
    int sum=0;
	for(int i=0;i<heights.length;i++){
	   sum+=heights[i];
	 }
	 return sum;
   }
   
   //mean height of the players
   public static double findMean(int[] heights){
    int sum=findSum(heights);
	int n=heights.length;
	 return (double)sum/n;
   }
   
   //shortest height of the players
   public static int findShortest(int[] heights){
     int min=heights[0];
	 for(int i=1;i<heights.length;i++){
	     if(heights[i]<min)
		 {
		    min = heights[i];
		 }
	 }
	 return min;
   }
   
   //tallest height of the players
   public static int findTallest(int[] heights){
     int max=heights[0];
	 for(int i=1;i<heights.length;i++){
	     if(heights[i]>max)
		 {
		    max = heights[i];
		 }
	 }
	 return max;
   }

   public static void main(String []args){
    Scanner input=new Scanner(System.in);
	
	//create array of 11 team players
	int heights[]= new int[11];
	Random rn = new Random();
	
	//generating random heights
	for(int i=0;i<heights.length;i++){
	heights[i]=rn.nextInt(101)+150;
	}
	
	//display heights of the players
	System.out.println("Heights of the players:");
	  for(int i=0;i<heights.length;i++){
	   System.out.print(heights[i]+" ");
       }
	  	System.out.println();
		
		int shortestHeight = findShortest(heights);
		int tallestHeight= findTallest(heights);
		double meanHeight = findMean(heights);


    //displaying the result
   System.out.println("Shortest Height of the player:" +shortestHeight);
   System.out.println(" Tallest Height of the player:"+tallestHeight);
   System.out.println(" Mean Height of the players:"+meanHeight);

	input.close();


	
}
}