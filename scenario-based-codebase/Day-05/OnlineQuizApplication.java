
import java.util.*;
public class OnlineQuizApplication{
   public static void main(String []args){
        Scanner input = new Scanner(System.in);
		String ansStore[] = new String[5];
		char ch='Y';
		int correctAns=0;
		while(ch=='Y'){
		    
		    System.out.println("Welcome too the Online Quiz");
			System.out.println("What is the national song of India?\n1.VandeMatram       2.despecito      3.Sare jahaan se accha        4.dil to baccha hai ji");
			ansStore[0] = input.nextLine();
			System.out.println("What is the national bird of India?\n1.Peacock           2.ostrich         3.owl          4.pegion");
			ansStore[1] = input.nextLine();
			System.out.println("What is the national anthem of India?\n1.Jan-Gan-Man     2.vande mantram    3. sare jahan se accha    4.chithi na koi");
			ansStore[2] = input.nextLine();
			System.out.println("Who is the first prime minister of India?\n1.Jawahar Lal Nehru        2.Bheem Rao      3.Chandra shekar        4.Mahatma Gandhi");
			ansStore[3] = input.nextLine();
			System.out.println("When india got independence?\n1.1947       2.1968      3.1945      4.1948");
			ansStore[4] = input.nextLine();
			for(int i=0;i<ansStore.length;i++){
			      String s = ansStore[i];
			
			switch(s){
			  case "VandeMatram":
			   correctAns++;
			   break;
			  case "Peacock":
			   correctAns++;
			   break;
			  case "Jan-Gan-Man":
			   correctAns++;
			   break;
			  case "Jawahar Lal Nehru":
			   correctAns++;
			   break;
			  case "1947":
			    correctAns++;
				break;
			
			  default:
			  System.out.println("Invalid Input:");
			}
		 }
			System.out.println("The total correct answer "+correctAns);
			System.out.println("Do you want to play again? (Y:N)");
			ch = input.next().charAt(0);
			
			System.out.println("Thank you! For playing the quiz");
			
		}
		input.close();
   }
}