public class Main {
    public static void main(String[] args){
        GetMovieTitle oMovieTitle = new GetMovieTitle();
        String movieTitle = oMovieTitle.movieTitle();
        System.out.println("Please try to guess below movie title by adding letters");
        Game game = new Game();
        String convertedMovieTitle = new Game().displayConvertedMovieTitle("", movieTitle);
        System.out.println(convertedMovieTitle);
        game.gameLogic(movieTitle);
    }
}
