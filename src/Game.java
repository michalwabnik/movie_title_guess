import java.util.Scanner;
public class Game {
    public void gameLogic(String movieTitle) {
        int guessCounter = 0;
        int guessLimit = 10;
        char enteredCharacter;
        String enteredCharacters  = "";
        String displayConvertedMovieTitle;
        Scanner scanner = new Scanner(System.in);
        while(guessCounter < guessLimit) {
            enteredCharacter = scanner.next().charAt(0);
            if(enteredCharacters.indexOf(enteredCharacter) >= 0){
                System.out.println("You have typed a character that has already been tried.");
            }else {
                enteredCharacters += enteredCharacter;
                displayConvertedMovieTitle = displayConvertedMovieTitle(enteredCharacters, movieTitle);
                if (movieTitle.equalsIgnoreCase(displayConvertedMovieTitle)) {
                    System.out.println(movieTitle);
                    System.out.println("You are a winner. I'm off");
                    break;
                } else {
                    guessCounter++;
                    if(guessCounter == guessLimit) {
                        System.out.println("You have lost!!!");
                    } else {
                        System.out.println("Not this time, keep guessing. You have " + (guessLimit - guessCounter) + " tries left");
                        System.out.println(displayConvertedMovieTitle);
                    }
                }
            }
        }

    }

    public String displayConvertedMovieTitle(String enteredCharacters, String movieTitle) {
        char character;
        char replacedCharacter = '_';
        StringBuilder displayMovieTitle = new StringBuilder();
        for (int i = 0; i < movieTitle.length(); i++) {
            character = movieTitle.charAt(i);
            if( enteredCharacters.indexOf(Character.toLowerCase(character)) >= 0) {
                displayMovieTitle.append(character);
            } else if(character == ' ') {
                displayMovieTitle.append(character);
            } else {
                displayMovieTitle.append(replacedCharacter);
            }
        }
        return displayMovieTitle.toString();
    }
}
