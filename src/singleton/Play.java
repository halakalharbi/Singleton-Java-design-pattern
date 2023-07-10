package singleton;

import java.util.LinkedList;


public class Play {

  public static void main(String[] args) {

    // create object of scrabble class
     ScrabbleGame scrabble = ScrabbleGame.getInstance();

    //create instance variable
    LinkedList<String> playerTiles ; 

    //print letter list at the begening of the game
    System.out.println(scrabble.getLetterList());

    // Get the size of the letters list 
    System.out.println("List size: " + scrabble.getListSize());

    //player request Tiles of 7
    playerTiles = scrabble.getTiles(7);

    //print player Tiles
    System.out.println(playerTiles);

    // Get size of the letters list 
    System.out.println("List size after player1: " + scrabble.getListSize());

  }

}