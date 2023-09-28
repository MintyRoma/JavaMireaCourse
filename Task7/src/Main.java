import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    enum Status
    {
        draft,
        player1,
        player2
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> player1 = new ArrayDeque<>();
        ArrayDeque<Integer> player2 = new ArrayDeque<>();
        for(int i=0; i<5;i++)
        {
            int input = scan.nextInt();
            player1.addLast(input);
        }
        for(int i=0; i<5;i++)
        {
            int input = scan.nextInt();
            player2.addLast(input);
        }

        Status stat = Status.draft;

        //Simulation
        int session;
        for(session =0; session<106;session++)
        {
            if(player1.isEmpty())
            {
                stat = Status.player2;
                break;
            }
            if(player2.isEmpty())
            {
                stat=Status.player1;
                break;
            }
            int card1 = player1.pop();
            int card2 = player2.pop();
            if(card1>card2)
            {
                if(card1==9 && card2==0)
                {
                    player2.addLast(card2);
                    player2.addLast(card1);
                }
                else {
                    player1.addLast(card1);
                    player1.addLast(card2);
                }
            }
            else if(card1<card2)
            {
                if(card1==0 && card2==9)
                {
                    player1.addLast(card1);
                    player1.addLast(card2);
                }
                else {
                    player2.addLast(card2);
                    player2.addLast(card1);
                }
            }
        }

        if(stat==Status.draft) System.out.println("botva");
        else System.out.println((stat==Status.player1?"first ":"second ")+session);
    }
}