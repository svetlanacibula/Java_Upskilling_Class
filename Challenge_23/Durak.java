package Challenge_23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Durak {
    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled deck", 4);

        List<List<Card>> players = dealCards(deck, 4, 5);
        printPlayerHands(players);
        sortPlayerHands(players);
        printPlayerHands(players);

        Card.Suit trump = getRandomTrumpSuit();
        System.out.println();
        System.out.println("Trump Suit: " + trump + " " + trump.getImage());

        int strongestPlayer = findStrongestTrumpPlayerIndex(players, trump);
        System.out.println("\nPlayer with strongest trump hand: Player " + (strongestPlayer + 1));

    }

    public static List<List<Card>> dealCards(List<Card> deck, int numPlayers, int cardsPerPlayer) {
        List<List<Card>> hands = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++) {
            hands.add(new ArrayList<>());
        }
        int totalCardsToDeal = numPlayers * cardsPerPlayer;
        for (int i = 0; i < totalCardsToDeal; i++) {
            hands.get(i % numPlayers).add(deck.get(i));
        }
        return hands;
    }

    public static void printPlayerHands(List<List<Card>> players) {
        System.out.println("\n--- Player Hands ---");
        for (int i = 0; i < players.size(); i++) {
            System.out.printf("Player %d: ", i + 1);
            players.get(i).forEach(card -> System.out.print(card + " "));
            System.out.println();
        }


    }

    public static void sortPlayerHands(List<List<Card>> players) {
        for (List<Card> hand : players) {
            hand.sort((c1, c2) -> Integer.compare(c1.rank(), c2.rank()));
        }
        System.out.println();
        System.out.println();
        System.out.println("Sorted by rank");
    }

    public static Card.Suit getRandomTrumpSuit() {
        Card.Suit[] suits = Card.Suit.values();
        Random random = new Random();
        return suits[random.nextInt(suits.length)];
    }

    public static int findStrongestTrumpPlayerIndex(List<List<Card>> players, Card.Suit trump) {
        int strongestPlayerIndex = -1;
        int highestTrumpScore = -1;

        for (int i = 0; i < players.size(); i++) {
            int trumpScore = 0;
            for (Card card : players.get(i)) {
                if (card.suit() == trump) {
                    trumpScore += card.rank();
                }
            }
            if (trumpScore > highestTrumpScore) {
                highestTrumpScore = trumpScore;
                strongestPlayerIndex = i;
            }
        }
        return strongestPlayerIndex;
    }

}
