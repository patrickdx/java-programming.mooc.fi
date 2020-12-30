
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLEngineResult;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Liwen Qu
 */
public class Hand implements Comparable<Hand>{
    
    private List<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
        
    }
    
    public void print(){
        
        hand.stream().forEach(xd -> System.out.println(xd));
        
    }
    public void sortBySuit(){
        
        Collections.sort(hand, (p1,p2) -> {
            if (p1.getSuit().ordinal() - p2.getSuit().ordinal() ==0){
                return p1.getValue() - p2.getValue();
            }
            return p1.getSuit().ordinal() - p2.getSuit().ordinal();
                });
    }
  public void sort(){
      
      Collections.sort(hand);   // sort cards
  }

    @Override
    public int compareTo(Hand cards) {
        
        int sum1 = this.hand.stream().mapToInt(func -> func.getValue()).sum();
            
        
       
       int sum2= cards.hand.stream().mapToInt(func -> func.getValue()).sum();
       
        return sum1-sum2;
    }
  
  
   
}
