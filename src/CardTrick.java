/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ehmad
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    public static void main(String[] args) {
        // Code to generate a random array of 7 cards (assuming it's an array of Strings)
        String[] magicHand = {"Card1", "Card2", "Card3", "Card4", "Card5", "Card6", "Card7"};

        // Code to ask the user to pick a card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card: ");
        String userCard = scanner.nextLine();

        // Code to search for the user's card in the array
        boolean isCardFound = false;
        for (String card : magicHand) {
            if (card.equals(userCard)) {
                isCardFound = true;
                break;
            }
        }

        // Report whether the user's card is in the magic hand
        if (isCardFound) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}