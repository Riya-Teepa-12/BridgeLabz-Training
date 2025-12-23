import java.util.Scanner;

public class DeckOfCardsGame{

    // methods to initialize the deck
    public static String[] initializeDeck(String[] sts,String[] ranks){

        int num=sts.length*ranks.length;
        String[] dck=new String[num];

        int index=0;
        for(int i=0;i<sts.length;i++){
            for(int j=0;j<ranks.length;j++){
                dck[index++]=ranks[j]+" of "+sts[i];
            }
        }
        return dck;
    }

    //methods shuffle the deck 
    public static String[] shuffleDeck(String[] dk){
        int n=dk.length;

        for(int i=0;i<n;i++){
            int random=i+(int)(Math.random()*(n-i));

            String temp=dk[i];
            dk[i]=dk[random];
            dk[random]=temp;
        }
        return dk;
    }

    //method to distribute n cards 
    public static String[][] distributeCards(String[] deck,int players,int cp){

        int total=players*cp;

        if(total>deck.length){
            System.out.println("Cards cannot be distributed!");
            return null;
        }

        String[][] result=new String[players][cp];

        int index=0;
        for(int i=0;i<players;i++){
            for(int j=0;j<cp;j++){
                result[i][j]=deck[index++];
            }
        }
        return result;
    }

    // print players and their cards
    public static void printPlayers(String[][] arr){

        for(int i=0;i<arr.length;i++){
            System.out.println("\nPlayer "+(i+1)+":");
            for(int j=0;j<arr[i].length;j++){
                System.out.println("  "+arr[i][j]);
            }
        }
    }

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10",
                        "Jack","Queen","King","Ace"};

        // initialize deck
        String[] deck=initializeDeck(suits,ranks);

        // shuffle deck
        deck=shuffleDeck(deck);

        // user input
        System.out.print("Enter number of players: ");
        int players=input.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardp=input.nextInt();

        // distribute cards
        String[][] pCards=distributeCards(deck,players,cardp);

        if(pCards!=null){
            printPlayers(pCards);
        }

        input.close();
    }
}
