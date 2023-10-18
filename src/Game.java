public class Game {
    public void displayConvertedMovieTitle(char enteredCharacter, String movieTitle) {
        char character;
        char replacedCharacter = '_';
        String displayMovieTitle = "";
        for (int i = 0; i < movieTitle.length(); i++) {
            character = movieTitle.charAt(i);
            if(character == enteredCharacter){
                displayMovieTitle = displayMovieTitle + character;
            } else if(character == ' ') {
                displayMovieTitle = displayMovieTitle + character;
            } else {
                displayMovieTitle = displayMovieTitle + replacedCharacter;
            }
            //System.out.print(displayCharacter);
        }
        System.out.print(displayMovieTitle);
    }
}
