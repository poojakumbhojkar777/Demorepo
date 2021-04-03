package Testing;
import java.util.ArrayList;
public class Cards{

     public static void main(String []args){
      
 
    String suits[] = {" of spades", " of hearts", " of clubs", " of diamonds"};
    String cards[] = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
     
        ArrayList<String> playingCards = new ArrayList<>();
        for(int i = 0;i < 4;i++) {
            for(int j = 0;j <13;j++) {
                playingCards.add(cards[j]+suits[i]);
            }
        }
     
        for (int k = 0; k < playingCards.size();k++) 
	      { 		      
	          System.out.println(playingCards.get(k)); 
	          
	      }   
     }

}


