import java.util.*;
public class OTP{


   //Genrating otp
   public static int[] otp(){
	
	int []otp=new int[10];
	for(int i=0;i<10;i++){
	    otp[i]=(int)(Math.random()*1000000);
	}
	
	return otp;
   }

   //Checking uniqueness
   public static boolean uniqueotp(int []otp){
	
	for(int i=0;i<10;i++){
	    for(int j=i+1;j<10;j++){
		if(otp[i]==otp[j])
		   return false;
	    }
	}
	
	return true;
   }

   public static void main(String []args){
	
	int otp[]=otp();
	if(uniqueotp(otp))
	   System.out.println("All Otp are unique");
	 else
	    System.out.println("Some Otp are same");

   }

   }
	


