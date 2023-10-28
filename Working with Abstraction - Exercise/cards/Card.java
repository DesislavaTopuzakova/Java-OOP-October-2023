package cards_03;

public class Card {
    private CardSuits cardSuit; //боя (пика, купа, каро, спатия)
    private CardRanks cardRank; //вид (асо, 2, 3, 4, 5, 6, 7, 8, 9, 10, вале, дама, поп)


    public Card(CardSuits cardSuit, CardRanks cardRank) {
        //нова празна карта
        //cardSuit = null
        //cardRank = null
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    //сила = стойността на боята + стойността на вид
    public int calculatePower() {
        return this.cardSuit.getValue() + this.cardRank.getValue();
    }
}
