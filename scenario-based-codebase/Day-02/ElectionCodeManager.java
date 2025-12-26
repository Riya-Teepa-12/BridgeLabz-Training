import java.util.*;
public class ElectionCodeManager{
  public static void main(String []args){
     Scanner input = new Scanner(System.in);
     int vote1 = 0, vote2 = 0, vote3 = 0;

    //creating loop to taking input of multiple voters
     while(true){
       System.out.println("Enter your age");
       int age = input.nextInt();
       
       if (age == -1) {
                break;
            }


       if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.println("Vote for candidate:");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");
                System.out.println("3. Candidate 3");

 
                int ch = input.nextInt();
 
                 switch (ch) {
                    case 1:
                        vote1++;
                        break;
                    case 2:
                        vote2++;
                        break;
                    case 3:
                        vote3++;
                        break;
                    default:
                        System.out.println("Invalid vote choice!");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }

            System.out.println();
        }

       //displaying the result 

        System.out.println("Election Results:");
        System.out.println("Candidate 1 votes: " + vote1);
        System.out.println("Candidate 2 votes: " + vote2);
        System.out.println("Candidate 3 votes: " + vote3);

        input.close();
       
             
       }
 }