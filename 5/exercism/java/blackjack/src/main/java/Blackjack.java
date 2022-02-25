import java.nio.charset.CharacterCodingException;
import java.time.temporal.ValueRange;
import java.util.HashMap;
import java.util.Map;

public class Blackjack {

    public static void main(String... args){
        Blackjack blackjack = new Blackjack();
        //System.out.println(blackjack.parseCard("queen"));

        //blackjack.largeHand(true, 0);

        String decision = blackjack.firstTurn("ace", "ace", "ace");
        System.out.println(decision);

    }

    public int parseCard(String card) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
        int getValue = 0;
        Map<String, Integer> value = new HashMap<>();
        value.put("ace", 11);
        value.put("two", 2);
        value.put("three", 3);
        value.put("four", 4);
        value.put("five", 5);
        value.put("six", 6);
        value.put("seven", 7);
        value.put("eight", 8);
        value.put("nine", 9);
        value.put("ten", 10);
        value.put("jack", 10);
        value.put("queen", 10);
        value.put("king", 10);
        value.put("other",0);

        for (Map.Entry<String, Integer> test : value.entrySet()){
            if (card.equals(test.getKey())){
                getValue = test.getValue();
            }
        }

        return getValue;
        
    }

    public boolean isBlackjack(String card1, String card2) {
        //throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
        int value1 = parseCard(card1);
        int value2 = parseCard(card2);
        int sum = value1 + value2;
        if (sum == 21 )
            return true;
        else
            return false;

    }

    public String largeHand(boolean isBlackjack, int dealerScore) {

        if(isBlackjack && dealerScore == parseCard("ace") || dealerScore == parseCard("ten") || dealerScore == parseCard("other")){
            return "S";
        }
        if(isBlackjack && (dealerScore != parseCard("ace") || dealerScore != parseCard("other") || dealerScore != parseCard("ten"))){
            return "W";
        }

        else{
            return "P";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17){
            return "S";
        }
        if (handScore <= 11){
            return "H";
        }
        if (handScore >= 12 && handScore <= 16 && dealerScore >= 7){
            return "H";
        }
        else{
            return "S";
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}