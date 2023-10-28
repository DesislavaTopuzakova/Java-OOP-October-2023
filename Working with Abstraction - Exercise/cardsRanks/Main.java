package cardsRanks;

import cards_03.CardRanks;

public class Main {
    public static void main(String[] args) {
        CardRanks[] cardRanks = CardRanks.values(); //масив с изброените елементи в Enum
        System.out.println("Card Ranks:");
        for (CardRanks cardRank : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank.name());
        }
    }
}
