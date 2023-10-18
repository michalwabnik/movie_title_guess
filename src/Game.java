import java.util.Scanner;
public class Game {
    public void gameLogic() {
        // run llop till end of game
        int guesCounter = 0;
        int guesLimit = 10;
        char enteredCharacter=' ';
        String enteredCharacters  = "";
        String displayConvertedMovieTitle;
        Scanner scanner = new Scanner(System.in);
        while(guesCounter < guesLimit) {
            enteredCharacter = scanner.next().charAt(0);
            if(enteredCharacters.indexOf(enteredCharacter) >= 0){
                System.out.println("You have typed a character that has already been tried.");
            } else {
                guesCounter++;
                enteredCharacters += enteredCharacter;
            }
            displayConvertedMovieTitle = displayConvertedMovieTitle(enteredCharacters, "Jakis tytul filmu");
            System.out.println(displayConvertedMovieTitle);
        }

        if(guesCounter == guesLimit) {
            System.out.println("You have lost!!!");
        }
    }
    /*public String concatEnteredCharacters(char enteredCharacter) {
        String enteredCharacters += enteredCharacter;
        enteredCharacters += enteredCharacter;
        return enteredCharacters;
    }*/
    public String displayConvertedMovieTitle(String enteredCharacters, String movieTitle) {
        char character;
        char replacedCharacter = '_';
        String displayMovieTitle = "";
        for (int i = 0; i < movieTitle.length(); i++) {
            character = movieTitle.charAt(i);
            if( enteredCharacters.indexOf(Character.toLowerCase(character)) >= 0) {
                displayMovieTitle += character;
            } else if(character == ' ') {
                displayMovieTitle += character;
            } else {
                displayMovieTitle += replacedCharacter;
            }
        }
        return displayMovieTitle;
    }
}
